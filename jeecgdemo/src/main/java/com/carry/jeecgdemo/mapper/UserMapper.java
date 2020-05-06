package com.carry.jeecgdemo.mapper;

import com.carry.jeecgdemo.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllUser();
}