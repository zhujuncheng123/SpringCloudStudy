package com.test.service;


import entity.Book;

/**
 * @author: zhujc
 * @Title: BookService
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 13:54
 */
public interface BookService {
    Book getBookById(int bid);
}
