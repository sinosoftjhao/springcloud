package com.sionsoft.nacos.controller;


import com.sionsoft.nacos.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/abcd")
    public String abc(){
        return "consumer client " + paymentService.getAbc();
    }

}
