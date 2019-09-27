package com.test.testdemo.controller;


import com.test.testdemo.dao.MongoTestDao;
import com.test.testdemo.pojo.MongoTestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//测试操作Mongodb数据库中的数据(增删改查)   使用的是springdata的 MongoTemplate来操作
@Controller
public class MongoTestController {


    @Autowired
    MongoTestDao mongoTestDao;



    @RequestMapping("/findByName")
    @ResponseBody
    //根据姓名查询内容
    public MongoTestPojo findByName(String name){

        MongoTestPojo list = mongoTestDao.findByName(name);
        System.out.println(list);
        return list;

    }



    @RequestMapping("/findByNameAndAge")
    @ResponseBody
    //根据小明和年龄查询所有   or  不是  and
    public MongoTestPojo findByNameAndAge(String name,String age){


        MongoTestPojo byNameAndAge = mongoTestDao.findByNameAndAge(name, age);

        System.out.println(byNameAndAge);
        return byNameAndAge;
    }


}
