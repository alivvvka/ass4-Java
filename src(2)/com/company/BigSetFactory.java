package com.company;

public class BigSetFactory implements IFactory{
    @Override
    public IBurger createBurger() {
        return new JalapenoDoubleBurger();
    }

    @Override
    public ICombo createCombo() {
        return new BigCombo();
    }
}
