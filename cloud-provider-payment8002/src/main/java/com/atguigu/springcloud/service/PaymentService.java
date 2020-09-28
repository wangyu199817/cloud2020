package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/9/25
 **/
public interface PaymentService {
    public  int create(Payment payment);

    public Payment getPaymentById( Long id);
}
