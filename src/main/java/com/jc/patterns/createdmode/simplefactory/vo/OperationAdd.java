package com.jc.patterns.createdmode.simplefactory.vo;

import java.math.BigDecimal;

/**
 * 加法操作类
 *
 * @author jiancheng
 * @date 2019-6-4
 */
public class OperationAdd implements Operation {

    @Override
    public BigDecimal getResult(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
