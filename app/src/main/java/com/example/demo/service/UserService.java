package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public void register(String username, String password) {

        User user = new User();
        user.setUsername(username);

        // ν ½ν΄¥ μ•”νΈν™”
        user.setPassword(encoder.encode(password));

        user.setRole("USER");

        repo.save(user);
    }
}

