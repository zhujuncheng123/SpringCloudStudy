package com.test.entity;

import entity.Book;
import entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import com.test.entity.*;


import java.util.List;

/**
 * @author: zhujc
 * @Title: UserBorrowDetail
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 14:28
 */
@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
