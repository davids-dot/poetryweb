package com.david.poetry.dao;

import com.david.poetry.bean.Poet;

import java.util.List;

/**
 * @author DavidStark
 */
public interface PoetMapper {

    /**
     * 根据词 查找相关名称的诗人
     * @param value
     * @return 诗人列表
     */
    List<Poet> getPoetsByName(String value);




    /**
     *  根据id 查询 诗人
     * @param lowIncludeId 诗人 id 下界, 包含
     * @param highExcId  id 上届，不包含，意义不大
     * @param size  查询个数
     * @return
     */
    List<Poet> getPoetsAndPoemsNum(Integer lowIncludeId, Integer highExcId , Integer size);


}
