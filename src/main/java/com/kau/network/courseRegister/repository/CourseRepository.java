package com.kau.network.courseRegister.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kau.network.courseRegister.model.Course;

@Repository
public class CourseRepository {
    private final List<Course> courses = new ArrayList<>();

    public List<Course> findAll() {
        return courses;
    }

    public Course findByCourseName(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                return course;
            }
        }

        return null;
    }
    
    public CourseRepository() {
        Course course;

        course = new Course(
            1,
            "컴퓨터네트워크",
            "최차봉",
                new LinkedList<>()
        );

        courses.add(course);

        course = new Course(2,
         "소프트웨어공학",
        "최차봉",
                new LinkedList<>()
        );

        courses.add(course);

        course = new Course(
            3,
            "AI융합 Capstone Design I",
            "정재훈",
                new LinkedList<>()
        );
        
        courses.add(course);

        course = new Course(
            4, 
            "문제해결기법", 
            "이인복",
                new LinkedList<>()
        );
    
        courses.add(course);
    }
}
