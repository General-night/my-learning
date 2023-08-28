package com.qc.model.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author：MoneyOrange
 * @Date：2023/8/27/2:37
 */

@Data
public class Payment implements Serializable {
    private static final long serialVersionUID = 20230827023859L;

    /**
     * MySQL中类型是bigint，Java中使用Long来接
     */
    private Long id;

    /**
     * 流水号
     */
    private String serial;
}
