package com.jc.patterns.behavioralmode.strategy.w3c;

/**
 * 策略模式客户端
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class Main {

    public static void main(String[] args) {



        /**
         * SimpleFactoryGetType.getType(1)  这里用了简单工厂来封装创建子类的方法
         */
        MathContext context = new MathContext(SimpleFactoryGetType.getType(1));
        System.out.println("10 + 5 = " + context.execute(10, 5));

        context = new MathContext(new MathSubstract());
        System.out.println("10 - 5 = " + context.execute(10, 5));

    }

}
