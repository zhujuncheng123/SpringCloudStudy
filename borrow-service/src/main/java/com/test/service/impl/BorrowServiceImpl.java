package com.test.service.impl;

import com.test.entity.Borrow;
import com.test.entity.UserBorrowDetail;
import com.test.mapper.BorrowMapper;
import com.test.service.BorrowService;
import entity.Book;
import entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: zhujc
 * @Title: BorrowServiceImpl
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 14:52
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Resource
    BorrowMapper mapper;

    @Resource
    RestTemplate template;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrow = mapper.getBorrowsByUid(uid);
        //RestTemplate支持多种方式的远程调用

        // 获取user信息 通过getForObject请求其他服务，并将结果自动封装
        User user = template.getForObject("http://userService/user/" + uid, User.class);
        // 获取书籍信息
        List<Book> bookList = borrow
                .stream()
                .map(b->template.getForObject("http://bookService/book/"+b.getBid(), Book.class))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);


    }
}
