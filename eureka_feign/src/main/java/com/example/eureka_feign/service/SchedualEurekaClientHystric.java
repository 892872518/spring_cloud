package com.example.eureka_feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualEurekaClientHystric implements SchedualEurekaClient {
    @Override
    public  String sayHiFromClientOne(String name) {
        return  "sorry," + name;
    }
}
