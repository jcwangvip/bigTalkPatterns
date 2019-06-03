package com.jc.patterns.simplefactory.vo;

import java.math.BigDecimal;

/**
 * 操作类接口
 *
 * @author jiancheng
 * @date 2019-6-4
 */
public interface Operation {

    public BigDecimal getResult(BigDecimal a,BigDecimal b);
}
