package com.cloud;

import java.time.ZonedDateTime;

/**
 * TODO
 *
 * @author gengxin.wang
 * @date 2024/5/13 17:27
 */
public class Main {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}