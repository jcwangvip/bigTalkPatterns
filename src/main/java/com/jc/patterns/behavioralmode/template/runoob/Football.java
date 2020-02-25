package com.jc.patterns.behavioralmode.template.runoob;

/**
 * 类描述
 *
 * @author jiancheng
 * @date 2019-7-2
 */

public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}

