package com.service.impl;

import com.entity.Img;
import com.entity.Shopping;
import com.mapper.ShoppingMapper;
import com.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingServiceImpl implements ShoppingService {
    @Autowired
    private ShoppingMapper shoppingMapper;
    @Override
    public List<Shopping> queryAll(String shopName) {
        return shoppingMapper.queryAll(shopName);
    }

    @Override
    public Boolean add(Shopping shopping) {
        return shoppingMapper.add(shopping)==1;
    }

    @Override
    public Boolean addtupian(Img img) {
        return shoppingMapper.addtupian(img)==1;
    }

    @Override
    public Shopping queryshopId(Integer shopId) {
        return shoppingMapper.queryshopId(shopId);
    }

    @Override
    public Boolean updateshop(Shopping shopping) {
        return shoppingMapper.updateshop(shopping)==1;
    }

    @Override
    public Boolean del(Integer shopId) {
        return shoppingMapper.del(shopId)==1;
    }

    @Override
    public List<Shopping> queryshopName(String shopName) {
        return shoppingMapper.queryshopName(shopName);
    }
}
