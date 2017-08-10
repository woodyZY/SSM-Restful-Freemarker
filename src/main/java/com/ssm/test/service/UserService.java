package com.ssm.test.service;

import java.util.List;

import com.ssm.test.entity.User;

public interface UserService {

    int deleteByPrimaryKey(Integer userid);


    int insert(User record);


    int insertSelective(User record);


    User selectByPrimaryKey(Integer userid);

    List<User>selectAll();
    
    int updateByPrimaryKeySelective(User record);


    int updateByPrimaryKey(User record);
}
