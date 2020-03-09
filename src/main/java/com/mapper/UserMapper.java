package com.mapper;

import com.entity.Address;
import com.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> query();
    User queryByid(@Param("id")Integer id);
    Integer delUser(@Param("id")Integer id);
    Integer delAddress(@Param("aid")Integer aid);
    Integer updateUser(@Param("user")User user);
    Integer updateAddress(@Param("address")Address address);
    Integer stop(@Param("id")Integer id);
    Integer start(@Param("id")Integer id);
}
