package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {
    List<User> query();
    User queryByid(Integer id);
    Boolean del(Integer id,Integer aid);
    Boolean update(User user);
    Boolean stop(Integer id);
    Boolean start(Integer id);
}
