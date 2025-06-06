package com.kau.network.courseRegister.controller;

import java.util.List;

import com.kau.network.courseRegister.model.User;
import com.kau.network.courseRegister.model.dto.in.CourseReq;
import com.kau.network.courseRegister.model.dto.out.MessageRes;
import com.kau.network.courseRegister.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kau.network.courseRegister.model.Course;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CourseController {
    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping("/course")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courseList = service.findAll();

        return ResponseEntity.ok(courseList);
    }

    @PostMapping("/course")
    public ResponseEntity<MessageRes> register(@RequestBody CourseReq courseReq) {
        MessageRes message = service.register(courseReq);

        return ResponseEntity.ok(message);
    }
}