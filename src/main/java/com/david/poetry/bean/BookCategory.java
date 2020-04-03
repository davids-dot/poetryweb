package com.david.poetry.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookCategory {
    Long id;
    Long parent;
    String description;

    /** 图书类型的根 id 值 */
    static final Long CATEGORY_ROOT = -1L;
}
