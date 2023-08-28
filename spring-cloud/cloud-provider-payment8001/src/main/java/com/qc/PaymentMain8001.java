package com.qc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/27/1:52
 */
@Slf4j(topic = "PaymentMain8001")
@SpringBootApplication
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
        log.info("PaymentMain8001 已启动......");
    }
}
