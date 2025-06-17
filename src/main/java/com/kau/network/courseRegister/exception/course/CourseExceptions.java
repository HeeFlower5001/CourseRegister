package com.kau.network.courseRegister.exception.course;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum CourseExceptions {
    COURSE_NOT_FOUND(HttpStatus.UNAUTHORIZED, "C1", "COURSE_NOT_FOUND");

    private final HttpStatus status;
    private final String code;
    private final String message;

    CourseExceptions(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}