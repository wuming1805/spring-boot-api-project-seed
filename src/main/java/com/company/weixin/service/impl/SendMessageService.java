package com.company.weixin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageService {

    @Autowired
    //private PersonService personService;

    @RequestMapping(value = "/api/person" ,method = RequestMethod.GET)
    public String sendmessage(){

        //WeixinAPIHelper.sendTextMessageToUser("测试","oSvrTwBXX277roCY1jJLiCTb2YvQ");
        return "";
    }

//    @RequestMapping(value = "/api/person/{id}", method = RequestMethod.GET)
//    public Person findOne(@PathVariable("id") Long id){
//        return personService.findOne(id);
//    }
//
//    @RequestMapping(value = "/api/person", method = RequestMethod.POST)
//    public void savePerson(@RequestBody Person person){
//        personService.savePerson(person);
//    }
//
//    @RequestMapping(value = "/api/person", method = RequestMethod.PUT)
//    public void updatePerson(@RequestBody Person person){
//        personService.updatePerson(person);
//    }
//
//    @RequestMapping(value = "/api/person/{id}", method = RequestMethod.DELETE)
//    public void deletePerson(@PathVariable("id") Long id){
//        personService.deletePerson(id);
//    }
}
