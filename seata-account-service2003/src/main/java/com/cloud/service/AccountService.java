package com.cloud.service;

import org.apache.ibatis.annotations.Param;

/**
 *
 * @author gengxin.wang
 * @date 2024/7/1 17:14
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 本次消费金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}
