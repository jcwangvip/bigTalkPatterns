package com.jc.patterns.behavioralmode.template.runoob;

/**
 * 主方法
 *
 * @author jiancheng
 * @date 2019-7-2
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
