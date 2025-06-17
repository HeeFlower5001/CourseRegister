package com.kau.network.courseRegister.model;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Log {
    private final Course course;
    private final User user;
    private final LocalDateTime time;

    public Log(Course course, User user) {
        this.course = course;
        this.user = user;
        this.time = LocalDateTime.now();
    }
}
