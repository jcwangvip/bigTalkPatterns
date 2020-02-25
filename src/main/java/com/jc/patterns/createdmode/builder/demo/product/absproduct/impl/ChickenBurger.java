package com.jc.patterns.createdmode.builder.demo.product.absproduct.impl;

import com.jc.patterns.createdmode.builder.demo.product.absproduct.Burger;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
