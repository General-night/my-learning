package com.qc.controller;

import cn.hutool.core.date.DateUtil;
import com.qc.model.entities.Payment;
import com.qc.model.vo.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/27/23:40
 */

@Slf4j(topic = "OrderController")
@RestController
@RequestMapping("/order")
public class OrderController {
    public static final String PAYMENT_SERVICE_URL = "http://" + "cloud-payment-service" + "/payment/";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/create")
    public ApiResponse<Payment> create(@RequestBody Payment payment) {

        log.info("【{}】订单：新增一条订单，进行支付【{}】", DateUtil.now(), payment);

        return restTemplate.postForObject(PAYMENT_SERVICE_URL + "create", payment, ApiResponse.class);
    }

    @GetMapping("/{pId}")
    public ApiResponse<Payment> getPaymentById(@PathVariable Long pId) {

        log.info("【{}】订单：根据ID查询支付信息【{}】", DateUtil.now(), pId);

        return restTemplate.getForObject(PAYMENT_SERVICE_URL + pId, ApiResponse.class);
    }
}
