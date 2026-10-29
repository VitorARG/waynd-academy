package com.wayndacademy.course.user.service;

import com.wayndacademy.course.user.entity.User;
import com.wayndacademy.course.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}
