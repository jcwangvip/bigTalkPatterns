package com.jc.patterns.behavioralmode.strategy.w3c;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class MathContext {

    private MathAlgorithm algorithm;

    public MathContext(MathAlgorithm strategy) {
        this.algorithm = strategy;
    }

    public int execute(int num1, int num2) {
        return algorithm.calculate(num1, num2);
    }

}
