package com.cloud.service;

/**
 *
 * @author gengxin.wang
 * @date 2024/7/1 17:02
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
