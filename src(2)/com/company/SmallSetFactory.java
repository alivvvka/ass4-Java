package com.company;

public class SmallSetFactory implements IFactory{
    @Override
    public IBurger createBurger() {
        return new SmallBurger();
    }

    @Override
    public ICombo createCombo() {
        return new SmallCombo();
    }
}
