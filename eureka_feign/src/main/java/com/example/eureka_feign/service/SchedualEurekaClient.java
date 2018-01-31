package com.example.eureka_feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EurekaClient",fallback = SchedualEurekaClientHystric.class)
public interface SchedualEurekaClient {
    @RequestMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
