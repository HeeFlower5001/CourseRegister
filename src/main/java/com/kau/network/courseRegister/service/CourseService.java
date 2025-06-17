package com.kau.network.courseRegister.service;

import com.kau.network.courseRegister.exception.course.CourseException;
import com.kau.network.courseRegister.exception.course.CourseExceptions;
import com.kau.network.courseRegister.exception.user.UserException;
import com.kau.network.courseRegister.exception.user.UserExceptions;
import com.kau.network.courseRegister.model.Course;
import com.kau.network.courseRegister.model.Log;
import com.kau.network.courseRegister.model.User;
import com.kau.network.courseRegister.model.dto.in.CourseReq;
import com.kau.network.courseRegister.model.dto.out.MessageRes;
import com.kau.network.courseRegister.repository.CourseRepository;
import com.kau.network.courseRegister.repository.LogRepository;
import com.kau.network.courseRegister.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    private final LogRepository logRepository;

    public CourseService(CourseRepository courseRepository, UserRepository userRepository, LogRepository logRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
        this.logRepository = logRepository;
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public MessageRes register(CourseReq courseReq) {
        User user = userRepository.findById(courseReq.getUserId());
        Course course = courseRepository.findByCourseName(courseReq.getCourseName());

        if (user == null) {
            throw new UserException(UserExceptions.ID_NOT_FOUND);
        }

        if (course == null) {
            throw new CourseException(CourseExceptions.COURSE_NOT_FOUND);
        }

        course.getStudents().add(user);

        Log log = new Log(course, user);

        logRepository.addLog(log);

        return new MessageRes("COURSE_REGISTER_SUCCESSFUL");
    }
}
