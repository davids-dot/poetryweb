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
public class Poet {
    Long id;
    String name;
    String dynasty;

    Integer poemCount;
}
