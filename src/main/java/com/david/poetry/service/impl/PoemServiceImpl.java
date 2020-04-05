package com.david.poetry.service.impl;

import com.david.poetry.bean.Poem;
import com.david.poetry.bean.PoetDetailAndPoems;
import com.david.poetry.dao.PoemMapper;
import com.david.poetry.service.PoemService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author DavidStark
 */
@Component
public class PoemServiceImpl implements PoemService {

    @Resource
    PoemMapper poemMapper;


    @Override
    public Poem getPoem(Integer poemId) {
        return poemMapper.getPoemById(poemId);
    }

    @Override
    public PoetDetailAndPoems getPoetDetailAndPoemsSummary(Integer poetId) {
        return poemMapper.getPoetDetailAndPoemsSummary(poetId);
    }
}
