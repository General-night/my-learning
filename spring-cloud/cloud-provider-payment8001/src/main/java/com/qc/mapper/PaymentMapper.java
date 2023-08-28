package com.qc.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qc.model.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/27/2:53
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
