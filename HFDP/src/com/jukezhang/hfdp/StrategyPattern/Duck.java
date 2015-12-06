package com.jukezhang.hfdp.StrategyPattern;

import lombok.Setter;

/**
 * Created by juke.zjk on 2015/12/5 005.
 */
public abstract class Duck {
    protected @Setter FlyBehavior flyBehavior;
    protected @Setter QuackBehavior quackBehavior;

    public Duck() {}
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
