package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author gengxin.wang
 * @date 2024/5/13 16:47
 */
@EnableDiscoveryClient //该注解用于向使用consul为注册中心时注册服务
@SpringBootApplication
public class Main80
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main80.class,args);
    }
}