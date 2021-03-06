package com.example.eureka_feign.web;

import com.example.eureka_feign.service.SchedualEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedualEurekaClient schedualEurekaClient;
    @RequestMapping("/hi")
    public  String sayHi(@RequestParam String name) {
        return  schedualEurekaClient.sayHiFromClientOne(name);
    }
}
