package cn.itcast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("send")
public class SendController {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @RequestMapping("sendMessage")
    public String sendMessage(String name){
        Map map=new HashMap();
        map.put("name",name);
        map.put("age",18);
        jmsMessagingTemplate.convertAndSend("haha",map);
        return "ok";
    }
}
