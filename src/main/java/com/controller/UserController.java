package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("query")
    public List<User> query(){return userService.query(); }

    @RequestMapping("queryByid")
    public User queryByid(@RequestParam("id")Integer id){ return userService.queryByid(id); }
    @RequestMapping("del")
    public Boolean del(@RequestParam("id")Integer id,@RequestParam("aid")Integer aid){ return userService.del(id,aid); }
    @RequestMapping("update")
    public Boolean update(User user){
        return userService.update(user);
    }

    @RequestMapping("stop")
    public Boolean stop(@RequestParam("id")Integer id){
        return userService.stop(id);
    }
    @RequestMapping("start")
    public Boolean start(@RequestParam("id")Integer id){
        return userService.start(id);
    }
}
