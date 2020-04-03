package com.david.poetry.service;


import com.david.poetry.bean.Poet;

import java.util.List;

/**
 * @author DavidStark
 */
public interface PoetService {

    /**
     *  根据词搜索诗人信息
     * @param searchWord 搜索词
     * @return 诗人信息列表
     */
    List<Poet> searchPoets(String searchWord);
}
