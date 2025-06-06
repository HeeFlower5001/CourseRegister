package com.kau.network.courseRegister.service;

import com.kau.network.courseRegister.model.User;
import com.kau.network.courseRegister.model.dto.in.LoginReq;
import com.kau.network.courseRegister.model.dto.out.MessageRes;
import com.kau.network.courseRegister.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAllUser() {
        List<User> users = repository.findAll();

        return users;
    }

    public MessageRes login(LoginReq loginReq) {
        User user = repository.findById(loginReq.getId());

        if (user == null) {
            return new MessageRes("ID가 존재하지 않습니다.");
        }

        if (!user.getPw().equals(loginReq.getPw())) {
            return new MessageRes("PW가 존재하지 않습니다.");
        }

        return new MessageRes("로그인에 성공했습니다.");
    }
}
