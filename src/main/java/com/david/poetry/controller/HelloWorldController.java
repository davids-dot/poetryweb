package com.david.poetry.controller;


import com.david.poetry.bean.Poem;
import com.david.poetry.dao.PoemMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author DavidStark
 */
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Resource
    PoemMapper poemMapper;


    @RequestMapping(path = "/sayHello",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String hello() {
        if (poemMapper != null) {
            Poem poem = poemMapper.getPoemById(1L);
            System.out.println("titile:" + poem.getTitle());

            System.out.println("poem:"  + poem.toString() );
            return poem.toString();
        }
        return "fail";
    }
}
