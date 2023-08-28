package com.qc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qc.mapper.PaymentMapper;
import com.qc.model.entities.Payment;
import com.qc.service.IPayment;
import org.springframework.stereotype.Service;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/27/2:55
 */
@Service
public class PaymentImpl extends ServiceImpl<PaymentMapper, Payment> implements IPayment {
}
