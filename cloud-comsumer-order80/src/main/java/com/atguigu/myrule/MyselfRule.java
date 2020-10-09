package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/10/9
 **/
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return  new RandomRule();//定义为随机
    }
}
