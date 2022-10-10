package com.test.mapper;

import entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: zhujc
 * @Title: UserMapper
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 13:44
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM DB_USER WHERE uid = #{uid}")
    User getUSerById(int uid);
}
