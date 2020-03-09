package com.controller;


import com.entity.Orderform;
import com.service.Orderforservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("orderform")
public class Orderformcontroller {
    @Autowired
    private Orderforservice orderforservice;

    @RequestMapping("query")
    public List<Orderform> query(@RequestParam("state") Integer state){
        return orderforservice.query(state);
    }
    @RequestMapping("update")
    public boolean update(@RequestParam("state") Integer state,
                          @RequestParam("dingdanid") String dingdanid){
        return  orderforservice.update(dingdanid,state);
    }
}
