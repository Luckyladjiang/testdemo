package com.test.testdemo.dao;


import com.test.testdemo.pojo.MongoTestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;



@Service
public class MongoTestDao {

    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * 根据用户名查询
     * @param name
     * @return
     */
    public MongoTestPojo findByName(String name){
        Query query = new Query(Criteria.where("name").is(name));
        MongoTestPojo one = mongoTemplate.findOne(query, MongoTestPojo.class);
        return one;

    }


    /**
     * 根据小明和年龄查询所有   or  不是  and
     * @param name
     * @param age
     * @return
     */

    public MongoTestPojo findByNameAndAge(String name,String age){

        Criteria criteria = new Criteria();  //在criteria中定义查询添加
        //orOperator表示是 or,满足条件就查询出来
        criteria.orOperator(Criteria.where("name").is(name),Criteria.where("age").is(age));

        Query query = new Query(criteria);
        MongoTestPojo list = mongoTemplate.findOne(query, MongoTestPojo.class);
        return list;

    }

}
