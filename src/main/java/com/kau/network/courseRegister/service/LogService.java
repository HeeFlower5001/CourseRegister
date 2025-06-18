package com.kau.network.courseRegister.service;

import com.kau.network.courseRegister.model.Log;
import com.kau.network.courseRegister.model.dto.out.MessageRes;
import com.kau.network.courseRegister.repository.CourseRepository;
import com.kau.network.courseRegister.repository.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    private final CourseRepository courseRepository;
    private final LogRepository repository;

    public LogService(LogRepository repository, CourseRepository courseRepository) {
        this.repository = repository;
        this.courseRepository = courseRepository;
    }

    public List<Log> findAll() {
        return repository.findAll();
    }

    public MessageRes clear() {
        repository.clear();
        courseRepository.clear();

        return new MessageRes("CLEAR_SUCCESS");
    }
}