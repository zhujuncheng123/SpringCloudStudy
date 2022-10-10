package com.test.controller;


import com.test.service.BookService;
import entity.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author: zhujc
 * @Title: BookController
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 13:56
 */
@RestController
public class BookController {

    @Resource
    BookService service;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid") int bid){
        return service.getBookById(bid);
    }
}