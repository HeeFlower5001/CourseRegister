package com.kau.network.CourseRegister.model;

import lombok.Data;

@Data
public class User {
    long id;
    String loginId;
    String loginPw;
    String name;
}
