package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Account;
import com.company.project.model.SendMessageToMK;
import com.company.project.service.AccountService;
import com.company.weixin.wechat.msg.WeixinAPIHelper;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/api",produces="application/json;charset=utf-8")
public class SendMessageController {
    private static final Logger LOG = LoggerFactory.getLogger(SendMessageController.class);
    @Resource
    AccountService accountService;
    @PostMapping("/sendMessageToMK")
    public Result sendMessageToMK(@RequestBody SendMessageToMK sendMessageToMK){
        JSONObject jsonObject = new JSONObject(sendMessageToMK);
        if (sendMessageToMK.getIdCard().equals("")|| sendMessageToMK.getIdCard()==null) {
            LOG.info("身份证号码为空");
            return ResultGenerator.genFailResult("身份证号码为空");
        }
        LOG.info("入参:"+ jsonObject.toString());
        Account account=accountService.findBy("idcard",sendMessageToMK.getIdCard());
        if(account == null)
        {
            LOG.info("当前用户未注册微信公众号");
            return ResultGenerator.genFailResult("当前用户未注册微信公众号");
        }
        WeixinAPIHelper.sendBindUserForMK(account.getOpenid(),sendMessageToMK.getTitle(),sendMessageToMK.getPrescription(),sendMessageToMK.getIssueDate(),sendMessageToMK.getRemark(),sendMessageToMK.getUrl());
        return ResultGenerator.genSuccessResult();
        }
}
