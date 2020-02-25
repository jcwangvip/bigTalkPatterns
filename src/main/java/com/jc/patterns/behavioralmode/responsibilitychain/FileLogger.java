package com.jc.patterns.behavioralmode.responsibilitychain;

/**
 * 创建扩展了该记录器类的实体类
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}

