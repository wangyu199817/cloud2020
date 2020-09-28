package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/9/25
 **/
@Mapper
public interface PaymentDao {
        public  int create(Payment payment);

        public Payment getPaymentById(@Param("id") Long id);
}
