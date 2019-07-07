package com.springboot.yaml.controller;


import com.springboot.yaml.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zl
 * @create 2019-07-07 11:54
 */

@RestController
public class Controller {
    @Autowired
    Person person;

    @RequestMapping("/hello")
    public String json(){
        return person.toString();
    }
}
