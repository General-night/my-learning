package com.qc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/31/23:28
 */

@Slf4j(topic = "EurekaMain7002")
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
        log.info("EurekaMain7002 已启动......");
    }
}
