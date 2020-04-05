package com.david.poetry.config;

import com.david.poetry.bean.Result;


/**
 * @author DavidStark
 * 常用响应结果及错误码
 */
public class R {

    private R(){}

    public static class Common {
        private Common() {}

        /** 参数错误 */
        public static final Result ARGUMENT_ERROR
                = new Result(400, "ARGUMENT_ERROR");

    }
}
