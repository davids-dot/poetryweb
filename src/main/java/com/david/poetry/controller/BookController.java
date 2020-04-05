package com.david.poetry.controller;

import com.david.poetry.bean.BookCategory;
import com.david.poetry.config.ConstConfig;
import com.david.poetry.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DavidStark
 */

@ResponseBody
@Controller
@RequestMapping("/book")
public class BookController {

    @Resource
    BookService bookService;

    @RequestMapping(path = "/category",method = RequestMethod.GET,
            produces = ConstConfig.JSON_CONTENT_TYPE)
    List<BookCategory> getBookCategory() {
        List<BookCategory> bookCategories = bookService.getBookCategories(-1L);
        if (bookCategories == null) {
            return new ArrayList<>();
        }
        return bookCategories;
    }
}
