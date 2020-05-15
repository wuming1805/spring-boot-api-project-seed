package com.company.weixin.util;

import com.alibaba.fastjson.JSONObject;
import com.company.weixin.Constants;

/**
 * 拼装URL工具类
 */
public class URLUtil {

    public static  String getAccessTookenURL(){
        return Constants.ACCESS_TOKEN_URL.replace("APPID", Constants.APPID).replace("APPSECRET",
                Constants.SECRET)
                + "&requestType=getAccessToken";
    }

    public static  String getOpenIdURL(String code){
        return Constants.OPENID_URL.replace("APPID", Constants.APPID).replace("APPSECRET",
                Constants.SECRET).replace("CODE", code);
    }


    public static String getRedirect(String url){
      return Constants.AUTH_PROJECT_URL.replace("APPID", Constants.APPID).replace("REDIRECT_URI", url);
    }

    //根据code获取openId
    public static String getOpenId(String code){
        JSONObject jsonObject = HttpsRequestCommon.httpsRequest(URLUtil.getOpenIdURL(code), "GET",
                null);
        if(null!=jsonObject&&jsonObject.containsKey("openid")){
           return jsonObject.getString("openid");
        }
        return null;
    }
}
