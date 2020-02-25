package com.jc.patterns.createdmode.builder.demo.product.pack.impl;

import com.jc.patterns.createdmode.builder.demo.product.pack.Packing;

/**
 * 实现 Packing 接口的实体类
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
