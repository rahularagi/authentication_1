package com.authentication.controllers;

import com.authentication.dtos.LogOutRequestDto;
import com.authentication.dtos.LoginRequestDto;
import com.authentication.dtos.SignUpRequestDto;
import com.authentication.dtos.UserDto;
import com.authentication.models.Token;
import com.authentication.models.User;
import com.authentication.services.UserService;
import jakarta.annotation.Nonnull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping("/signup")
    public User signUp(@RequestBody SignUpRequestDto signUpRequestDto){
        String email = signUpRequestDto.getEmail();
        String password = signUpRequestDto.getPassword();
        String name = signUpRequestDto.getName();
        return userService.SignUp(name,email,password);
    }
    @PostMapping("/login")
    public Token login(@RequestBody LoginRequestDto loginRequestDto){
        return userService.login(loginRequestDto.getEmail(), loginRequestDto.getPassword());
    }
    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestBody LogOutRequestDto logOutRequestDto){
        userService.logout(logOutRequestDto.getToken());
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("/validate/{token}")
    public UserDto validateToken(@PathVariable("token") @Nonnull String token){
        return UserDto.from(userService.validateToken(token));
    }
}
