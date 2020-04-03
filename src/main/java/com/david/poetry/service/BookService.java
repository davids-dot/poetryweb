package com.david.poetry.service;

import com.david.poetry.bean.BookCategory;

import java.util.List;

/**
 * 图书服务接口
 * @author DavidStark
 */
public interface BookService {

     /**
      *  获取某类型的子类型
      * @param parentId 父类型 的id
      * @return 类型列表
      */
     List<BookCategory> getBookCategories(Long parentId);
}
