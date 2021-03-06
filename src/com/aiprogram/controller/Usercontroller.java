package com.aiprogram.controller;

import com.aiprogram.entity.Student;
import com.aiprogram.entity.User;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.aiprogram.service.StudentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by 没想法的岁月 on 2018/4/7.
 */
@Component
@Controller
@RequestMapping("user")//打上这个标签后带有user的这些请求在这个类中处理
public class Usercontroller {



    //处理请求，每一个请求都对应一个方法且返回值都是String 返回的值接上我之前默认的路径，就可以找到对应的页面
    @RequestMapping("/test/{name}/{id}")
    //返回String类型的写法
    public String testUser(ModelMap modelMap, HttpServletRequest request, @PathVariable("name") String name1, @PathVariable("id") Integer id1) {
        //我们可以在请求上面带些参数我们来获取带的参数信息(处理的是get请求)
        System.out.println(name1);
        System.out.println(id1);
        //在这里可以做一些 request的操作
//        request.getParameter("");
        //具体处理事务
        User user = new User();
        user.setId(17);
        user.setName("没想法的岁月");
        modelMap.addAttribute("user", user);
        //处理完后在根据返回值调到指定的页面
//        return "user";
        //我们在这里重定向页面
        return "redirect:/user/demo";
    }

    //返回modelAndView的写法
    @RequestMapping("/demo")
    public ModelAndView testUser1(ModelAndView modelAndView) {
        //处理具体的事务
        ModelAndView model = new ModelAndView();
        model.setViewName("user");
        User user = new User();
        user.setName("ModelAndView");
        user.setId(12);
        model.addObject("user", user);
        return model;
    }

    //这里在演示请求post的请求
    @RequestMapping("/demo1")
    public String testUser2() {

//        String id = request.getParameter("id");
//        String name = request.getParameter("name");
//
//        User user = new User();
//        user.setId(16);
//        user.setName("SprintMvc");
//        modelMap.addAttribute("user", user);
        return "demo1";
    }

    //这里在演示请求post的请求
    @RequestMapping("/demo2")
    public String testUser3(ModelMap modelMap, User user) {
        modelMap.addAttribute("user", user);
        return "demo2";
    }

    //阿里巴巴fastjson的演示
    @RequestMapping("/demo3")
    //ResponseBody 表示调用mvc:message-converters处理数据返回的数据
    @ResponseBody
    public User testUser4() {
        User user = new User();
        user.setName("吕布");
        user.setId(14);
        return user;
    }

    @Autowired
    @Resource
    private StudentService  studentService;
    //使用postman在前端传入Json后直接到user对象中去,设置了值接受post请求，在参数加上@ResponseBody 表示把接收过来的json转到User对象中去
    @RequestMapping(value = "/demo4", method = RequestMethod.POST)
    public String testUser5(@RequestBody Student student) {
        studentService.createStudent(student);
        return "user";
    }

    //演示文件的上传
    @RequestMapping("/upload")
    public String testUser5(MultipartFile file, HttpServletRequest request) throws IOException {
        //获取文件的名称
        String name = file.getOriginalFilename();
        //判断文件的格式
//        name.equals(".mp3");
        //创建一个文件对象来存放文件
        File uploadF = new File("/" + name);
        //把上传的文件存放都爱uploadF文件夹中
        file.transferTo(uploadF);
        return "demo4";
    }

    @RequestMapping("/demo4")
    public String testUser6() {

//        String id = request.getParameter("id");
//        String name = request.getParameter("name");
//
//        User user = new User();
//        user.setId(16);
//        user.setName("SprintMvc");
//        modelMap.addAttribute("user", user);
        return "demo4";
    }

    //演示文件的下载
    @RequestMapping("down")
    public ResponseEntity<byte[]> download() throws IOException {
        String path = "F:/MM.jpg";
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        //告诉服务器（这里应该指我们本地）这个图片资源在哪里
        headers.setContentDispositionFormData("attachment", path);
        //告诉服务器格式是什么
        headers.setContentType(MediaType.IMAGE_JPEG);
        //返回一个响应体（参数都是定死，具体见Http协议）
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }

}
