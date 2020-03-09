package com.mapper;

import com.entity.Orderform;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Dingdanmapper {
    public List<Orderform> query(@Param("state") Integer state);
    public  int update(@Param("dingdanid") String dingdanid, @Param("state") Integer state);
}
