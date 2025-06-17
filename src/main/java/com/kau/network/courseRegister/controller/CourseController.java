package com.kau.network.courseRegister.controller;

import java.util.List;

import com.kau.network.courseRegister.model.Log;
import com.kau.network.courseRegister.model.dto.in.CourseReq;
import com.kau.network.courseRegister.model.dto.out.MessageRes;
import com.kau.network.courseRegister.service.CourseService;
import com.kau.network.courseRegister.service.LogService;
import com.kau.network.courseRegister.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.kau.network.courseRegister.model.Course;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CourseController {
    private final CourseService service;
    private final LogService logService;

    public CourseController(CourseService service, LogService logService) {
        this.service = service;
        this.logService = logService;
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

    @DeleteMapping("/course")
    public ResponseEntity<MessageRes> register() {
        MessageRes message = service.deleteAll();

        return ResponseEntity.ok(message);
    }
}