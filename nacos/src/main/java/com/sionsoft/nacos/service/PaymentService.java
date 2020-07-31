package com.sionsoft.nacos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "cloud-payment")
public interface PaymentService {

    @GetMapping("/abc")
    public String getAbc();
}
