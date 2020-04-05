package com.david.poetry.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author DavidStark
 */
@Getter
@Setter
@ToString
public class PoetDetailAndPoems {
    Poet poet;
    List<Poem> poems;
}
