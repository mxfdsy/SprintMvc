package com.aiprogram.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;

/**
 * Created by 没想法的岁月 on 2018/4/7.
 */
@Component

@RequestMapping("user")//打上这个标签后带有user的这些请求在这个类中处理
public class Usercontroller {

    //处理请求，每一个请求都对应一个方法且返回值都是String 返回的值接上我之前默认的路径，就可以找到对应的页面
    @RequestMapping("/test")
    public String testUser(){
        //具体处理事务
        System.out.println("这里");
        //处理完后在根据返回值调到指定的页面
             return "user";
    }

    @RequestMapping("/demo")
    public String testUser1(){
        //处理具体的事务
        return "user";
    }
}
