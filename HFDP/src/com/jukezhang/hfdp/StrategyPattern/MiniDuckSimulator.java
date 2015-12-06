package com.jukezhang.hfdp.StrategyPattern;

import com.jukezhang.hfdp.StrategyPattern.impl.FlyRocketPowered;
import com.jukezhang.hfdp.StrategyPattern.impl.MallardDuck;
import com.jukezhang.hfdp.StrategyPattern.impl.ModelDuck;

/**
 * Created by juke.zjk on 2015/12/5 005.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();

        duck = new ModelDuck();
        duck.display();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();

        DuckCall duckCall = new DuckCall();
        duckCall.quack();
    }
}
