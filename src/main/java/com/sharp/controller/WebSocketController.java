package com.sharp.controller;

import java.math.BigDecimal;

/**
 * Created by 584003 on 2017/3/24.
 */
public class WebSocketController {

    public static void main(String[] args){
        float f = 3.300f;
        BigDecimal b = BigDecimal.valueOf(f);
        System.out.print(b);
    }


    public static void hello(Integer a){
        System.out.print("Integer"+a);
    }

    public static void hello(Long a){
        System.out.print("Long"+a);
    }

    public static void hello(Double a){
        System.out.print("Double"+a);
    }

    public static void hello(BigDecimal a){
        System.out.print("BigDecimal"+a);
    }
}
