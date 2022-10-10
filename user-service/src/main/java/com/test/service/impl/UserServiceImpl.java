package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.service.UserService;
import entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: zhujc
 * @Title: UserServiceImpl
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 13:47
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int uid) {
        return mapper.getUSerById(uid);
    }
}
