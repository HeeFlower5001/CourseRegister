package com.kau.network.courseregister.model;

import lombok.Data;

@Data
public class User {
    private long studentId;
    private String id;
    private String pw;
    private String name;

    public User(long studentId, String id, String pw, String name) {
        this.studentId = studentId;
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }
}
