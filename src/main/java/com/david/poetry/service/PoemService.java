package com.david.poetry.service;

import com.david.poetry.bean.Poem;
import com.david.poetry.bean.PoetDetailAndPoems;

/**
 * @author DavidStark
 */
public interface PoemService {


    /**
     *   id 查询
     * @param poemId id
     * @return
     */
    Poem getPoem(Integer poemId) ;

    /**
     * 根据诗人id 获取诗人详情和 作品总览
     * @param poetId 诗人id
     * @return
     */
    PoetDetailAndPoems getPoetDetailAndPoemsSummary(Integer poetId);
}
