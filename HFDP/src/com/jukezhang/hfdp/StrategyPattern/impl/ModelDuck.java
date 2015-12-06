package com.jukezhang.hfdp.StrategyPattern.impl;

import com.jukezhang.hfdp.StrategyPattern.Duck;

/**
 * Created by juke.zjk on 2015/12/5 005.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
