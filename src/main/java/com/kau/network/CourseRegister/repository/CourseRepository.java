package com.kau.network.courseregister.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kau.network.courseregister.model.Course;

@Repository
public class CourseRepository {
    private final List<Course> courses = new ArrayList<>();
    
    public CourseRepository() {
        Course course;

        course = new Course(
            1,
            "컴퓨터네트워크",
            "최차봉"
        );

        courses.add(course);

        course = new Course(2,
         "소프트웨어공학",
        "최차봉");

        courses.add(course);

        course = new Course(
            3,
            "AI융합 Capstone Design I",
            "정재훈"
        );
        
        courses.add(course);

        course = new Course(
            4, 
            "문제해결기법", 
            "이인복"
        );
    
        courses.add(course);
    }

    public List<Course> findAll() {
        return courses;
    }
}
