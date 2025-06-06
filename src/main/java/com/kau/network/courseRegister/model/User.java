package com.kau.network.courseRegister.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private long studentId;
    private String id;
    private String pw;
    private String name;
}
