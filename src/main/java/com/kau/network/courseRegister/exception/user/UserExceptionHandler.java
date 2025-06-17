package com.kau.network.courseRegister.exception.user;


import com.kau.network.courseRegister.exception.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExceptionResponse> handler(UserException e) {
        ExceptionResponse response = ExceptionResponse.builder()
                .status(e.getHttpStatus())
                .message(e.getMessage())
                .data(null)
                .build();
        return ResponseEntity.status(e.getHttpStatus()).body(response);
    }
}