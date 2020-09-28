package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/9/25
 **/
@SpringBootApplication
@EnableEurekaClient
public class Ordermain80 {
    public static void main(String[] args) {
        SpringApplication.run(Ordermain80.class,args);
    }
}
