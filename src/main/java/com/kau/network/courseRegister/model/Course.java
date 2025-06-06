package com.kau.network.courseRegister.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Queue;

@Getter
@AllArgsConstructor
public class Course {
    private long id;
    private String name;
    private String professor;
    private Queue<User> students;
}
