package com.example.eureka_ribbon.web;

import com.example.eureka_ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hi")
    public  String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
