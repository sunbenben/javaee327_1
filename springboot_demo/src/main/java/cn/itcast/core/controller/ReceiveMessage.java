package cn.itcast.core.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ReceiveMessage {
    //监听器接收消息
    @JmsListener(destination = "haha")
    public void ReceiveMessage(Map map){
        System.out.println("名称："+map.get("name"));
        System.out.println("年龄："+map.get("age"));
    }
}
