package com.jukezhang.hfdp.StrategyPattern.impl;

import com.jukezhang.hfdp.StrategyPattern.FlyBehavior;

/**
 * Created by juke.zjk on 2015/12/5 005.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
