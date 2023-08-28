package com.qc.controller;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qc.model.entities.Payment;
import com.qc.model.vo.ApiResponse;
import com.qc.service.IPayment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/27/1:51
 */
@Slf4j(topic = "PayController")
@RestController
@RequestMapping("/payment")
public class PayController {

    @Autowired
    private IPayment iPayment;

    @PostMapping("/create")
    public ApiResponse<Payment> createPayment(@RequestBody Payment payment) {
        log.info("【{}】支付：新增一条支付信息【{}】", DateUtil.now(), payment);
        iPayment.save(payment);

        return ApiResponse.success(payment);
    }

    @GetMapping("/{id}")
    public ApiResponse<Payment> getPaymentById(@PathVariable Long id) {
        log.info("【{}】支付：根据ID查询支付信息【{}】", DateUtil.now(), id);
        Payment payment = iPayment.getOne(new LambdaQueryWrapper<Payment>().eq(Payment::getId, id));

        return ApiResponse.success(payment);
    }
}
