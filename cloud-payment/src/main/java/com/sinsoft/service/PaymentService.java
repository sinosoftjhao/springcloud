package com.sinsoft.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RestController
public class PaymentService {

    @Value(value = "${abc:123}")
    private String abc;

    @GetMapping("/abc")
    public String getAbc(){
        return "provider go go go !" + abc;
    }


}
