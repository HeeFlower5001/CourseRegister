package com.kau.network.courseRegister.controller;

import com.kau.network.courseRegister.model.Log;
import com.kau.network.courseRegister.model.dto.out.MessageRes;
import com.kau.network.courseRegister.service.LogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogController {
    private final LogService service;

    public LogController(LogService service) {
        this.service = service;
    }

    @GetMapping("/log")
    public ResponseEntity<List<Log>> getAllCourses() {
        List<Log> logList = service.findAll();

        return ResponseEntity.ok(logList);
    }

    @DeleteMapping("/log")
    public ResponseEntity<MessageRes> clear() {
        MessageRes message = service.clear();

        return ResponseEntity.ok(message);
    }
}
