package com.zjy.springbootdemo.service;

import com.zjy.springbootdemo.entity.User;
import com.zjy.springbootdemo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public int save(User user) {
        if (user.getId() == null) { //user没有id为新增
            return userMapper.insert(user);
        } else {  //否则为更新
            return userMapper.update(user);
        }
    }
}
