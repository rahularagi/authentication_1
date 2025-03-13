package com.authentication.controllers;

import com.authentication.dtos.SignUpRequestDto;
import com.authentication.models.User;
import com.authentication.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping("/")
    public User login(@RequestBody SignUpRequestDto signUpRequestDto){
        String email = signUpRequestDto.getEmail();
        String password = signUpRequestDto.getPassword();
        String name = signUpRequestDto.getName();
        return userService.SignUp(name,email,password);
    }
}
