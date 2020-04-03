package com.david.poetry.service.impl;

import com.david.poetry.bean.BookCategory;
import com.david.poetry.dao.BookMapper;
import com.david.poetry.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.invoke.MethodHandles;
import java.util.List;


/**
 * 图书服务 实现类
 * @author DavidStark
 */
@Component
public class BookServiceImpl implements BookService {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Resource
    BookMapper bookMapper;

    @Override
    public List<BookCategory> getBookCategories(Long parentId) {
        if (parentId == null || parentId < -1) {
            return null;
        }
        List<BookCategory> categories = bookMapper.getCategories(parentId);
        logger.debug("get book categories from db,{}", categories);
        return categories;
    }
}
