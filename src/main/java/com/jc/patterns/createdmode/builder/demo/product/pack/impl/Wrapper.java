package com.jc.patterns.createdmode.builder.demo.product.pack.impl;

import com.jc.patterns.createdmode.builder.demo.product.pack.Packing;

/**
 *
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }

}
