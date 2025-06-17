package com.kau.network.courseRegister.service;

import com.kau.network.courseRegister.model.Log;
import com.kau.network.courseRegister.repository.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    private final LogRepository repository;

    public LogService(LogRepository repository) {
        this.repository = repository;
    }

    public List<Log> findAll() {
        return repository.findAll();
    }
}
