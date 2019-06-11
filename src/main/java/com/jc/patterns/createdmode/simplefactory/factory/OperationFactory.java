package com.jc.patterns.createdmode.simplefactory.factory;

import com.jc.patterns.createdmode.simplefactory.vo.Operation;
import com.jc.patterns.createdmode.simplefactory.vo.OperationAdd;

/**
 * 操作工厂类
 *
 * @author jiancheng
 * @date 2019-6-3
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            default:
                System.out.println("还没适配,请加上对应的操作类型");
        }
        return operation;
    }
}
