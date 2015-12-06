package com.jukezhang.hfdp.ObserverPattern.Version1;

/**
 * Created by juke.zjk on 2015/12/6 006.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
