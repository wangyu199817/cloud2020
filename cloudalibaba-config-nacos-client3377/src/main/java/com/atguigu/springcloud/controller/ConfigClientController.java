package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/10/16
 **/
@RestController
/**
 * 保证自动刷新
 */
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")    public String getConfigInfo() {
        return configInfo;
    }
}
