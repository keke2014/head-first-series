package com.jukezhang.hfdp.StrategyPattern.impl;

import com.jukezhang.hfdp.StrategyPattern.Duck;

/**
 * Created by juke.zjk on 2015/12/5 005.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
