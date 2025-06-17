package com.kau.network.courseRegister.exception.course;

import com.kau.network.courseRegister.exception.ExceptionResponse;
import com.kau.network.courseRegister.exception.user.UserException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CourseExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handler(CourseException e) {
        ExceptionResponse response = ExceptionResponse.builder()
                .status(e.getHttpStatus())
                .message(e.getMessage())
                .data(null)
                .build();
        return ResponseEntity.status(e.getHttpStatus()).body(response);
    }
}
