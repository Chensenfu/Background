package com.mapper;

import com.entity.Img;
import com.entity.Shopping;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingMapper {
    public  List<Shopping> queryAll(@Param("shopName") String shopName);

    public Integer add(@Param("shopping") Shopping shopping);

    public Integer addtupian(@Param("img") Img img);

    public Shopping queryshopId(@Param("shopId") Integer shopId);

    public Integer updateshop(@Param("shopping") Shopping shopping);

    public Integer del(@Param("shopId") Integer shopId);

    public List<Shopping> queryshopName(@Param("shopName") String shopName);
}
