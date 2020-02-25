package com.jc.patterns.behavioralmode.strategy.w3c;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2020-2-24
 */
public class SimpleFactoryGetType {

    static MathAlgorithm getType(int type) {
        return type == 1 ? new MathAdd() : new MathSubstract();
    }

}
