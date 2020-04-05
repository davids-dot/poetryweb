package com.david.poetry.controller;


import com.david.poetry.bean.Poem;
import com.david.poetry.dao.PoemMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.david.poetry.config.ConstConfig;

import javax.annotation.Resource;

/**
 * @author DavidStark
 */
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Resource
    PoemMapper poemMapper;


    @RequestMapping(path = "/sayHello",method = RequestMethod.GET,
            produces = ConstConfig.JSON_CONTENT_TYPE)
    public String hello() {
        if (poemMapper != null) {
            Poem poem = poemMapper.getPoemById(1);
            System.out.println("titile:" + poem.getTitle());

            System.out.println("poem:"  + poem.toString() );
            return poem.toString();
        }
        return "fail";
    }
}
