package com.atguigu.springcloud;

import com.atguigu.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/9/25
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyselfRule.class)
public class Ordermain80 {
    public static void main(String[] args) {
        SpringApplication.run(Ordermain80.class,args);
    }
}
