package com.example.springcloud.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/eureka")
    public String index(){
        return "Eureka Server Port:"+port;
    }
}
