package com.david.poetry.controller;


import com.david.poetry.bean.Poet;
import com.david.poetry.bean.Result;
import com.david.poetry.config.R;
import com.david.poetry.service.PoetService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    Result<List<Poet>> getPoets(@RequestParam(name = "searchWord") String searchWord) {
        List<Poet> retLst = new ArrayList<>();
        if (StringUtils.isBlank(searchWord)) {
            return new Result<>(retLst);
        }
        return new Result<>(poetService.searchPoets(searchWord));
    }


    /**  单次请求最大数量 */
    public static final int PAGE_MAX_DATA = 20;

    /** 分页查询接口
     * @param minId 诗人最小 id 数
     * @param pageSize 页大小 10
     * @return
     *   页码       1, 2  3
     *    min id   1, 11 21
     */
    @RequestMapping(path = "/page")
    @SuppressWarnings("unchecked")
    Result<List<Poet>>  getPoets(@RequestParam(name = "minId") Integer minId,
                        @RequestParam(name = "pageSize") Integer pageSize ) {

        if ( minId < 0 || pageSize < 0  || pageSize > PAGE_MAX_DATA) {
            return R.Common.ARGUMENT_ERROR;
        }

        List<Poet> poetsByIdRange = poetService.getPoetsByIdRange(minId, pageSize);
        return new Result<>(poetsByIdRange);
    }
}
