package com.service.impl;

import com.entity.Address;
import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> query() {
        return userMapper.query();
    }

    @Override
    public User queryByid(Integer id) {
        return userMapper.queryByid(id);
    }

    @Override
    public Boolean del(Integer id,Integer aid) {
        userMapper.delAddress(aid);
        return userMapper.delUser(id)==1;
    }

    @Override
    public Boolean update(User user) {
        userMapper.updateUser(user);
        return userMapper.updateAddress(user.getAddress())==1;
    }

    @Override
    public Boolean stop(Integer id) {
        return userMapper.stop(id)==1;
    }

    @Override
    public Boolean start(Integer id) {
        return userMapper.start(id)==1;
    }

}
