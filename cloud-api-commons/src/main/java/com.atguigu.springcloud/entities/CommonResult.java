package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @descipe:
 * @author: WY
 * @create: 2020/9/25
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String message;
    private  T date;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
