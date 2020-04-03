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
     *  诗人及其作品数目
     * @param lowIncludeId 诗人 id 下界, 包含
     * @param upExcludedId 诗人 id 上届, 不包含
     * @return
     */
    List<Poet> getPoetsAndPoemsNum(Integer lowIncludeId, Integer upExcludedId);


}
