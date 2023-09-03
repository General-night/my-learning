package com.qc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/27/1:52
 */

@EnableEurekaClient
@Slf4j(topic = "PaymentMain8001")
@SpringBootApplication
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
        log.info("PaymentMain8002 已启动......");
    }
}
