package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/10/16
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class,args);
    }
}

