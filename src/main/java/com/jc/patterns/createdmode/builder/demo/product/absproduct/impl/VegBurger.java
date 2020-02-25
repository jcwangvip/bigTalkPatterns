package com.jc.patterns.createdmode.builder.demo.product.absproduct.impl;

import com.jc.patterns.createdmode.builder.demo.product.absproduct.Burger;

/**
 * Burger的扩展类
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
