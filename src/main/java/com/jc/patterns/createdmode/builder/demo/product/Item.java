package com.jc.patterns.createdmode.builder.demo.product;

import com.jc.patterns.createdmode.builder.demo.product.pack.Packing;

/**
 * 食物条目和食物包装的接口
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public interface Item {

    float price();

    Packing packing();

    String name();
}
