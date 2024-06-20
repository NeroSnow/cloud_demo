package com.cloud.apis;

import com.cloud.resp.ResultData;
import com.cloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 *
 * @author gengxin.wang
 * @date 2024/6/20 17:15
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi
{
    @Override
    public ResultData getPayByOrderNo(String orderNo)
    {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}
