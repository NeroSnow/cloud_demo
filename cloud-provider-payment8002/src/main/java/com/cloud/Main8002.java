package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 *
 * @author gengxin.wang
 * @date 2024/5/13 14:25
 */
@RefreshScope // 动态刷新
@EnableDiscoveryClient
@MapperScan("com.cloud.mapper")
@SpringBootApplication
public class Main8002 {
    public static void main(String[] args) {
        SpringApplication.run(Main8002.class,args);
    }
}