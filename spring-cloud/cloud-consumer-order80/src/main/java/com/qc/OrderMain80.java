package com.qc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/27/23:15
 */

@Slf4j(topic = "OrderMain80")
@SpringBootApplication
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
        log.info("OrderMain80 已启动......");
    }
}
