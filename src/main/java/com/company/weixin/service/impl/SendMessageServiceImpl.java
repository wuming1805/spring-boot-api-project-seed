package com.company.weixin.service.impl;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class SendMessageServiceImpl {
    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
    public static void main(String[] argv) {
        Object implementor = new SendMessageServiceImpl();
        String address = "http://localhost:12345/SendMessage";
        Endpoint.publish(address, implementor);
    }
}