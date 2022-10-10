package com.test.service;

import entity.User;

/**
 * @author: zhujc
 * @Title: UserService
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 13:46
 */
public interface UserService {

    User getUserById(int uid);
}
