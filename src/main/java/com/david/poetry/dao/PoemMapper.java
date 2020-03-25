package com.david.poetry.dao;

import  com.david.poetry.bean.Poem;

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
    Poem getPoemById(Long id);
}
