package com.example.demo.controller;

import com.example.demo.service.UserServiceSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceSV userServiceSVImpl;

    @GetMapping("/getAll")
    public List<Map> getAll(){
        return  userServiceSVImpl.getAll();
    }
}
