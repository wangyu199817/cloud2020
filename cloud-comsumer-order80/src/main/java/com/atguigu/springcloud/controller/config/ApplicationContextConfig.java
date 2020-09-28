package com.atguigu.springcloud.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/9/25
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
