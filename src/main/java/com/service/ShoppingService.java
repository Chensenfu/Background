package com.service;

import com.entity.Img;
import com.entity.Shopping;


import java.util.List;

public interface ShoppingService {

    public List<Shopping> queryAll(String shopName);

    public Boolean add(Shopping shopping);

    public Boolean addtupian(Img img);

    public Shopping queryshopId(Integer shopId);

    public Boolean updateshop(Shopping shopping);

    public Boolean del(Integer shopId);

    public List<Shopping> queryshopName(String shopName);
}
