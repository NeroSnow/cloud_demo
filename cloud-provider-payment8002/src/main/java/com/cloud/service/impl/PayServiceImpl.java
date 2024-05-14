package com.cloud.service.impl;

import com.cloud.entities.Pay;
import com.cloud.mapper.PayMapper;
import com.cloud.service.PayService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author gengxin.wang
 * @date 2024/5/13 14:47
 */
@Service
public class PayServiceImpl implements PayService {

    @Resource
    PayMapper payMapper;


    @Override
    public int add(Pay pay){
        return payMapper.insertSelective(pay);
    }
    @Override
    public int delete(Integer id){
        return payMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int update(Pay pay){
        return payMapper.updateByPrimaryKeySelective(pay);
    }
    @Override
    public Pay getById(Integer id){
        return payMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<Pay> getAll(){
        return payMapper.selectAll();
    }
}
