package com.jc.patterns.behavioralmode.observer;


/**
 * 使用 Subject 和实体观察者对象
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("修改状态");
        subject.setState(15);
    }

}
