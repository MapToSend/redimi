package com.xcc.demo.redimi.service;

import com.xcc.demo.redimi.mapper.UserMapper;
import com.xcc.demo.redimi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public User finUserById(Integer id) {

        return userMapper.Sel(id);
    }

    public int addUser(User user) {

        try {
            userMapper.addUser(user);
            return 1;
        } catch (Exception e) {
            return 0;
        }

    }
}
