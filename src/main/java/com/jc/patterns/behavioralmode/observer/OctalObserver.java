package com.jc.patterns.behavioralmode.observer;


/**
 * 类描述
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}

