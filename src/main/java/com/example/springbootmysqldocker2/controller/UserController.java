package com.example.springbootmysqldocker2.controller;


import com.example.springbootmysqldocker2.Dto.User;
import com.example.springbootmysqldocker2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser(){
        return new ResponseEntity<>(userService.fetchUserList(), HttpStatus.OK);
    }

    @PostMapping("/saveUser")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        if(userService.saveUser(user)!=null){
            return new ResponseEntity<>("User Saved", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("User Not Saved", HttpStatus.BAD_REQUEST);
        }
    }
}
