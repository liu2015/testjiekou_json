package com.example.demo.mapper;

import com.example.demo.entity.TUser;
import mybatis.MyMapper;

import java.util.List;

public interface TUserMapper extends MyMapper<TUser> {
    Boolean add(TUser user);

    List<TUser> seach(String userName, String phone);
    int insert1(TUser user);

}