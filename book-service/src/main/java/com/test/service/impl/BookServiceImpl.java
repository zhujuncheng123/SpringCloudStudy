package com.test.service.impl;


import com.test.mapper.BookMapper;
import com.test.service.BookService;
import entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: zhujc
 * @Title: BookServiceImpl
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 13:55
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
