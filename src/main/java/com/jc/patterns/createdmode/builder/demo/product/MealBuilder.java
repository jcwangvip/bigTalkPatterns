package com.jc.patterns.createdmode.builder.demo.product;

import com.jc.patterns.createdmode.builder.demo.product.*;
import com.jc.patterns.createdmode.builder.demo.product.absproduct.impl.ChickenBurger;
import com.jc.patterns.createdmode.builder.demo.product.absproduct.impl.Coke;
import com.jc.patterns.createdmode.builder.demo.product.absproduct.impl.Pepsi;
import com.jc.patterns.createdmode.builder.demo.product.absproduct.impl.VegBurger;

/**
 * 负责创建 Meal 对象实际builder对象
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
