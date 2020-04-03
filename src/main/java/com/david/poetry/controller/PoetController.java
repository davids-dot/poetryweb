package com.david.poetry.controller;


import com.david.poetry.bean.Poet;
import com.david.poetry.service.PoetService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author DavidStark
 */
@RestController
@RequestMapping("/poets")
public class PoetController {

    @Resource
    PoetService poetService;

    @RequestMapping(path = "/search")
    List<Poet> getPoets(@RequestParam(name = "searchWord") String searchWord) {
        List<Poet> retLst = new ArrayList<>();
        if (StringUtils.isBlank(searchWord)) {
            return retLst;
        }
        return poetService.searchPoets(searchWord);
    }

    /** 分页查询接口
     * @param pageIdx 页码， 1，2,3 …………
     * @param pageSize 页大小 10
     * @param pageNums 页数， 默认为1
     * @return
     *   页码       1, 2  3
     *    min id   1, 11 21
     */
    @RequestMapping(path = "/page")
    List<Poet> getPoets(@RequestParam(name = "pageIdx") Integer pageIdx,
                        @RequestParam(name = "pageSize") Integer pageSize,
                        @RequestParam(name = "pageNums", required = false,
                                defaultValue = "1" ) Integer pageNums) {
        if ( pageIdx < 1 || pageSize < 0 ) {
            return Collections.emptyList();
        }
        Integer minId = (pageIdx -1 ) * pageSize + 1;
        return Collections.emptyList();
    }
}
