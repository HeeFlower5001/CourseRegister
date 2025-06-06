package com.kau.network.courseRegister.service;

import com.kau.network.courseRegister.model.Course;
import com.kau.network.courseRegister.model.User;
import com.kau.network.courseRegister.model.dto.in.CourseReq;
import com.kau.network.courseRegister.model.dto.out.MessageRes;
import com.kau.network.courseRegister.repository.CourseRepository;
import com.kau.network.courseRegister.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    public CourseService(CourseRepository courseRepository, UserRepository userRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public MessageRes register(CourseReq courseReq) {
        User user = userRepository.findById(courseReq.getUserId());
        Course course = courseRepository.findByCourseName(courseReq.getCourseName());

        return new MessageRes("수강신청 성공!");
    }
}
