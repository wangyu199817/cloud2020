package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/10/10
 **/
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance>serviceInstances );
}
