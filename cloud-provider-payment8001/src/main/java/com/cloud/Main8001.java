package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 *
 * @author gengxin.wang
 * @date 2024/5/13 14:25
 */
@MapperScan("com.cloud.mapper")
@SpringBootApplication
public class Main8001 {
    public static void main(String[] args) {
        SpringApplication.run(Main8001.class,args);
    }
}