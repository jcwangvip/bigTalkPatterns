package com.jc.patterns.behavioralmode.observer;


/**
 * 观察者之一Hexa
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        System.out.println(this.getClass().getName() + "去注册");
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex 接收到通知: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
