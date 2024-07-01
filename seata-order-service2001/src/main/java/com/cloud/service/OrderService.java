package com.cloud.service;

import com.cloud.entities.Order;

/**
 *
 * @author gengxin.wang
 * @date 2024/7/1 15:51
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);


}
