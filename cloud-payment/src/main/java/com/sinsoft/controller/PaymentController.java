package com.sinsoft.controller;

import com.sinsoft.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {


    @Autowired
    ConfigurableApplicationContext applicationContext;

    @Autowired
    PaymentService paymentService;
    @Value("${common.name:456}")
    private String name;

    @GetMapping(value = "/get")
    public String get(){
        return applicationContext.getEnvironment().getProperty("abc");
    }
    @GetMapping(value = "/get1")
    public String get1(){
        return paymentService.getAbc();
    }
}
