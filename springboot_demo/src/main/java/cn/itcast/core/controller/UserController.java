package cn.itcast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    /*
    读取配置文件信息
     */
    @Autowired
    private Environment environment;
    @RequestMapping("sayHello")
    public String sayHello(){
        return "Hello:"+environment.getProperty("url");
    }
}
