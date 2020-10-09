package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/10/9
 **/
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/payment/consul")
    public String paymentConsul(){
        return "spring cloud with consul："+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
