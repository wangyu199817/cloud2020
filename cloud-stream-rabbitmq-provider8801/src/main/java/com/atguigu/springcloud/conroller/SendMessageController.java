package com.atguigu.springcloud.conroller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/10/15
 **/
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider provider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return provider.send();

    }
}
