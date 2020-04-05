package com.david.poetry.controller;

import com.david.poetry.bean.Poem;
import com.david.poetry.bean.PoetDetailAndPoems;
import com.david.poetry.bean.Result;
import com.david.poetry.config.R;
import com.david.poetry.service.PoemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author DavidStark
 */
@RestController
@RequestMapping("/poems")
public class PoemController {

    @Resource
    PoemService poemService;


    @RequestMapping(value = "/query", method = RequestMethod.GET)
    Result<PoetDetailAndPoems> getPoetDetailAndPoems(
            @RequestParam(name = "poetId") Integer poetId ) {

       if (poetId < 0) {
           return R.Common.ARGUMENT_ERROR;
       }
       Result<PoetDetailAndPoems> result = new Result<>();

        PoetDetailAndPoems poetDetailAndpoemSumma = poemService.getPoetDetailAndPoemsSummary(poetId);

        result.setData(poetDetailAndpoemSumma);
        return result;
    }

    @RequestMapping(value = "/poem",method = RequestMethod.GET)
    Result<Poem> getPoemById(@RequestParam(name = "poemId") Integer poemId) {
        if (poemId < 0) {
            return R.Common.ARGUMENT_ERROR;
        }
        Result<Poem> r = new Result<>();
        r.setData( poemService.getPoem(poemId) );
        return r;
    }

}
