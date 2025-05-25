package com.kau.network.courseregister.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kau.network.courseregister.model.Course;
import com.kau.network.courseregister.repository.CourseRepository;

@Controller
public class CourseController {
    private final CourseRepository repository;

    @Autowired
    public CourseController(CourseRepository courseRepository) {
        this.repository = courseRepository;
    }

    @GetMapping("/course")
    public List<Course> login(@RequestBody Course course) {
        return repository.findAll();
    }
}