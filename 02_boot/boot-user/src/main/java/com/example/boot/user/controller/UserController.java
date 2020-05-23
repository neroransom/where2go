package com.example.boot.user.controller;

import com.example.boot.user.dto.RegisterDTO;
import com.example.boot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author : wang ziyu
 * @create 2020/3/22 4:15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@Valid RegisterDTO dto) {
        boolean result = userService.register(dto);
        if (result) {
            return "注册成功";
        }
        return "注册失败";
    }

}