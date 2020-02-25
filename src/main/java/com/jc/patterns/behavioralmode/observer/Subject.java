package com.jc.patterns.behavioralmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建 主题 类
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
        System.out.println("当前收集具体的观察者，具体的注册名称" + observer.getClass().getName());
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}