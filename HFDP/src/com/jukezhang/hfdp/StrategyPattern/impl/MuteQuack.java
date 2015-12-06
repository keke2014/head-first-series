package com.jukezhang.hfdp.StrategyPattern.impl;

import com.jukezhang.hfdp.StrategyPattern.QuackBehavior;

/**
 * Created by juke.zjk on 2015/12/5 005.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}