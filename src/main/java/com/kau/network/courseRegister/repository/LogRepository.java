package com.kau.network.courseRegister.repository;

import com.kau.network.courseRegister.model.Log;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Getter
@Repository
public class LogRepository {
    private List<Log> logs = new ArrayList<>();

    public List<Log> findAll() {
        return logs;
    }

    public void addLog(Log log) {
        logs.add(log);
    }
}
