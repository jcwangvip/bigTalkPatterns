package com.jc.patterns.behavioralmode.observer;

/**
 * 创建 observer 类
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
