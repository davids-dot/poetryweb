package com.david.poetry.dao;

import com.david.poetry.bean.BookCategory;

import java.util.List;

/**
 * 数据库操作接口
 * @author DavidStark
 */
public interface BookMapper {

    List<BookCategory> getCategories(Long parentId);
}
