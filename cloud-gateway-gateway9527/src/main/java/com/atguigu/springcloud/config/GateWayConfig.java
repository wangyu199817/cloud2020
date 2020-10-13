package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/10/13
 **/
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes=routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",r->r.path("/**").uri("http://news.baidu.com/game")).build();
        return routes.build();
    }
}
