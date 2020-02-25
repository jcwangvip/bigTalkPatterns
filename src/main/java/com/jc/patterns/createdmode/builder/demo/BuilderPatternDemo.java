package com.jc.patterns.createdmode.builder.demo;

import com.jc.patterns.createdmode.builder.demo.product.Meal;
import com.jc.patterns.createdmode.builder.demo.product.MealBuilder;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2020-2-25
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
