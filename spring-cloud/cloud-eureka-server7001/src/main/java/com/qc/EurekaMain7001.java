package com.qc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/29/0:10
 */

@EnableEurekaServer
@Slf4j(topic = "EurekaMain7001")
@SpringBootApplication
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
        log.info("EurekaMain7001 已启动......");
    }
}
