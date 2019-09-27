package com.test.testdemo.pojo;


import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;


@ToString
@Data
@Document(collection = "user")
public class MongoTestPojo {


    private String id;
    private String name;
    private String age;


}
