package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/9/25
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result=paymentService.create(payment);
        log.info("*******插入结果："+result);
        if(result>0){
            return  new CommonResult(200,"插入结果集成功！",result);
        }else{
            return new CommonResult(444,"插入结果集失败！",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
       Payment payment=paymentService.getPaymentById(id);
       int age=10/2;
        log.info("*******插入结果："+payment);
        if(payment!=null){
            return  new CommonResult(200,"查询成功了！",payment);
        }else{
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }
    }
}
