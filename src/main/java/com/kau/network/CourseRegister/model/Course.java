package com.kau.network.courseregister.model;

import lombok.Data;

@Data
public class Course {
    private long id;
    private String name;
    private String professor;

    public Course(long id, String name, String professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
    }
}
