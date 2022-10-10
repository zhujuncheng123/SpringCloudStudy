package com.test.mapper;


import entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: zhujc
 * @Title: BookMapper
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 13:54
 */
@Mapper
public interface BookMapper {

    @Select("select * from DB_BOOK where bid = #{bid}")
    Book getBookById(int bid);
}
