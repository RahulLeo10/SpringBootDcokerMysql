package com.example.springbootmysqldocker2.service;

import com.example.springbootmysqldocker2.Dto.User;

import java.util.List;

public interface UserService {

    User saveUser(User department);

    /**
     * Fetches the list of all department entities.
     * @return a list of departments
     */
    List<User> fetchUserList();
}
