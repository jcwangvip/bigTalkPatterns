package com.jc.patterns.createdmode.simplefactory;

import com.jc.patterns.createdmode.simplefactory.factory.OperationFactory;
import com.jc.patterns.createdmode.simplefactory.vo.Operation;

import java.math.BigDecimal;

/**
 * 主类
 *
 * @author jiancheng
 * @date 2019-6-4
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {

        Operation operate = OperationFactory.createOperate("+");
        BigDecimal result = operate.getResult(new BigDecimal("1"), new BigDecimal("2"));
        System.out.println("输出结果" + result);

    }
}
