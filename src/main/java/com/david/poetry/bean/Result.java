package com.david.poetry.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author DavidStark
 */
@Getter
@Setter
@ToString
public class Result<T> {

    private  Integer code = 200;

    private  String desc = "OK";

    private  Object data;

    public Result(T obj) {
        this.data = obj;
    }

    public Result() {
    }

    public Result(Integer code,String desc) {
        this.code = code;
        this.desc = desc;
    }

}
