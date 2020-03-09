package com.service.impl;

import com.entity.Orderform;
import com.mapper.Dingdanmapper;
import com.service.Orderforservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Orderformserviceimpl implements Orderforservice {
    @Autowired
    private Dingdanmapper dingdanmapper;
    @Override
    public List<Orderform> query( Integer state) {
        return dingdanmapper.query(state);
    }

    @Override
    public boolean update(String dingdanid, Integer state) {
        return dingdanmapper.update(dingdanid,state)!=0;
    }


}
