package com.david.poetry.service.impl;

import com.david.poetry.bean.Poet;
import com.david.poetry.dao.PoetMapper;
import com.david.poetry.service.PoetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.invoke.MethodHandles;
import java.util.List;

/**
 * @author DavidStark
 */
@Component
public class PoetServiceImpl implements PoetService {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Resource
    PoetMapper poetMapper;

    @Override
    public List<Poet> searchPoets(String searchWord) {
        List<Poet> poets = poetMapper.getPoetsByName(searchWord);
        logger.debug("get poets from db,{}", poets);
        return poets;
    }


    //
    private static final int EXTRA_POET_ID_SIZE = 20;

    @Override
    public List<Poet> getPoetsByIdRange(Integer minIncId, Integer size) {
        return poetMapper.getPoetsAndPoemsNum(minIncId,minIncId + EXTRA_POET_ID_SIZE, size);
    }
}
