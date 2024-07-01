package com.cloud.controller;

import com.cloud.entities.Order;
import com.cloud.resp.ResultData;
import com.cloud.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gengxin.wang
 * @date 2024/7/1 17:23
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public ResultData create(Order order)
    {
        orderService.create(order);
        return ResultData.success(order);
    }
}
