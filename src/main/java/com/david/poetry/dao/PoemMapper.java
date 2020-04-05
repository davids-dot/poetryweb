package com.david.poetry.dao;

import  com.david.poetry.bean.Poem;
import com.david.poetry.bean.PoetDetailAndPoems;

/**
 * @author DavidStark
 */
public interface PoemMapper {

    /***
     * fetch poem by id
     *
     * @param id
     * @return
     */
    Poem getPoemById(Integer id);


    PoetDetailAndPoems getPoetDetailAndPoemsSummary(Integer poetId);
}
