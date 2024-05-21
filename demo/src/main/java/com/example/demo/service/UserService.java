package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    public User createCustomer(User user) {
        user.setPassword(user.getPassword());  // Encode the password
        user.setRole("CUSTOMER");  // Set the role to CUSTOMER
        return userRepository.save(user);
    }
}
