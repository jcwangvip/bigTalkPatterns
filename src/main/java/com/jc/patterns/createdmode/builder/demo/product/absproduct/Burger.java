package com.jc.patterns.createdmode.builder.demo.product.absproduct;

import com.jc.patterns.createdmode.builder.demo.product.Item;
import com.jc.patterns.createdmode.builder.demo.product.pack.Packing;
import com.jc.patterns.createdmode.builder.demo.product.pack.impl.Wrapper;

/**
 * Item 接口的抽象类，该类提供了默认的功能
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
