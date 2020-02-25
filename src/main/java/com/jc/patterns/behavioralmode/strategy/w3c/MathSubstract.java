package com.jc.patterns.behavioralmode.strategy.w3c;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class MathSubstract implements MathAlgorithm {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
