package com.test.service;

import com.test.entity.UserBorrowDetail;

/**
 * @author: zhujc
 * @Title: BorrowService
 * @ProjectName: SpringCloudStudy
 * @Description:
 * @date: 2022/10/10 14:52
 */
public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);
}
