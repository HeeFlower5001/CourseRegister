package com.kau.network.courseRegister.service;

import com.kau.network.courseRegister.exception.user.UserException;
import com.kau.network.courseRegister.exception.user.UserExceptions;
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
        return repository.findAll();
    }

    public MessageRes login(LoginReq loginReq) {
        User user = repository.findById(loginReq.getId());

        if (user == null) {
            throw new UserException(UserExceptions.ID_NOT_FOUND);
        }

        if (!user.getPw().equals(loginReq.getPw())) {
            throw new UserException(UserExceptions.PASSWORD_MISMATCH);
        }

        return new MessageRes("LOGIN_SUCCESS");
    }
}
