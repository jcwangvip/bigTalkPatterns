package com.jc.patterns.behavioralmode.responsibilitychain;

/**
 * 创建扩展了该记录器类的实体类
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
