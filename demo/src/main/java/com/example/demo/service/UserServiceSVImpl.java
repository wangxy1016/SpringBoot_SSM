package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceSVImpl implements UserServiceSV {

    @Autowired
    private UserDAO dao;
    @Override
    public List<Map> getAll() {
        return dao.getAll();
    }
}
