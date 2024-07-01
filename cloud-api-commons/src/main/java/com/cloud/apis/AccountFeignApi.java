package com.cloud.apis;

import com.cloud.resp.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author gengxin.wang
 * @date 2024/7/1 15:29
 */
@FeignClient(value = "seata-account-service")
public interface AccountFeignApi
{
    //扣减账户余额
    @PostMapping("/account/decrease")
    ResultData decrease(@RequestParam("userId") Long userId, @RequestParam("money") Long money);
}
