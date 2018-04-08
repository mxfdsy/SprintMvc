package com.aiprogram.controller;

import com.aiprogram.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.PublicKey;

/**
 * Created by 没想法的岁月 on 2018/4/7.
 */
@Component
@RequestMapping("user")//打上这个标签后带有user的这些请求在这个类中处理
public class Usercontroller {

    //处理请求，每一个请求都对应一个方法且返回值都是String 返回的值接上我之前默认的路径，就可以找到对应的页面
    @RequestMapping("/test")
    //返回String类型的写法
    public String testUser(ModelMap modelMap){
        //具体处理事务
        User user = new User();
        user.setId(17);
        user.setName("没想法的岁月");
        modelMap.addAttribute("user", user);
        //处理完后在根据返回值调到指定的页面
        return "user";
    }
    //返回modelAndView的写法
    @RequestMapping("/demo")
    public ModelAndView testUser1(ModelAndView modelAndView){
        //处理具体的事务
        ModelAndView model = new ModelAndView();
        model.setViewName("user");
        User user = new User();
        user.setName("ModelAndView");
        user.setId(12);
        model.addObject("user", user);
        return model;
    }
}
