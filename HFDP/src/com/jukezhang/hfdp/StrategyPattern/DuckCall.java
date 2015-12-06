package com.jukezhang.hfdp.StrategyPattern;

import com.jukezhang.hfdp.StrategyPattern.impl.Quack;
import lombok.Setter;

/**
 * Created by juke.zjk on 2015/12/5 005.
 */
public class DuckCall implements QuackBehavior {
    private @Setter QuackBehavior quackBehavior;

    DuckCall() {
        quackBehavior = new Quack();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }
}
