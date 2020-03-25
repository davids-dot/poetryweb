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
public class Poem {

    Long id;

    String title;

    String content;

    Long authorId;

    String dynasty;

    String author;
}
