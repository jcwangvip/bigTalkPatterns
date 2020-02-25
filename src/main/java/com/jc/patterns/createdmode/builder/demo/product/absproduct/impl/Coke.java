package com.jc.patterns.createdmode.builder.demo.product.absproduct.impl;

import com.jc.patterns.createdmode.builder.demo.product.absproduct.ColdDrink;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
