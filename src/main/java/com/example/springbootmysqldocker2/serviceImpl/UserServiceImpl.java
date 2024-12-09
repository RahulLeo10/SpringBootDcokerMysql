package com.example.springbootmysqldocker2.serviceImpl;


import com.example.springbootmysqldocker2.Dto.User;
import com.example.springbootmysqldocker2.repoistory.UserRepository;
import com.example.springbootmysqldocker2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
         return (User)userRepository.save(user);

    }

    @Override
    public List<User> fetchUserList() {

        return userRepository.findAll();
    }
}
