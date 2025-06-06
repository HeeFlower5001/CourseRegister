package com.kau.network.CourseRegister.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    long id;
    String loginId;
    String loginPw;
    String name;
}
