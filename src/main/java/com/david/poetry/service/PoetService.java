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

    /**
     *  根据 id 范围查询诗人信息, 结果包含诗人作品数
     * @param minIncId
     * @param size
     * @return
     */
    List<Poet> getPoetsByIdRange(Integer minIncId, Integer size);
}
