package com.kau.network.courseRegister.exception.user;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum UserExceptions {
    ID_NOT_FOUND(HttpStatus.UNAUTHORIZED, "U1", "ID_NOT_FOUND"),
    PASSWORD_MISMATCH(HttpStatus.UNAUTHORIZED, "U2", "PASSWORD_MISMATCH");

    private final HttpStatus status;
    private final String code;
    private final String message;

    UserExceptions(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
