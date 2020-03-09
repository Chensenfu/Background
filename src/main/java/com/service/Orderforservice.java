package com.service;

import com.entity.Orderform;

import java.util.List;

public interface Orderforservice {
    public List<Orderform> query( Integer state);
    public boolean update(String dingdanid, Integer state);
}
