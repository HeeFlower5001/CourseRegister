package com.kau.network.courseRegister.exception.course;

import org.springframework.http.HttpStatus;

public class CourseException extends RuntimeException {
    public final CourseExceptions courseExceptions;

    public CourseException(CourseExceptions courseExceptions) {
        this.courseExceptions = courseExceptions;
    }

    public HttpStatus getHttpStatus() {
        return courseExceptions.getStatus();
    }

    public String getMessage() {
        return courseExceptions.getMessage();
    }
}

