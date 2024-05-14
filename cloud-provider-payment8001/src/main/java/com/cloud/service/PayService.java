package com.cloud.service;

import com.cloud.entities.Pay;

import java.util.List;

/**
 *
 * @author gengxin.wang
 * @date 2024/5/13 14:46
 */
public interface PayService {
    public int add(Pay pay);
    public int delete(Integer id);
    public int update(Pay pay);

    public Pay   getById(Integer id);
    public List<Pay> getAll();
}
