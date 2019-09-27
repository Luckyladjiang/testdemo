package com.test.testdemo.controller;


import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//测试字符串输出为html在浏览器展示
@Controller
public class testController extends testStringToHtml{

    @RequestMapping("/test")
    @ResponseBody
    public void testStringToHtml(HttpServletResponse response) throws IOException {

       String test = super.test;

        String str = super.str;

        ServletOutputStream outputStream = response.getOutputStream();
        response.setHeader("Content-type","text/html;charset=utf-8");
        outputStream.write(str.getBytes("utf-8"));
        System.out.println(test);



    }






}
