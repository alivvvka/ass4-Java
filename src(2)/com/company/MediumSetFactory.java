package com.company;

public class MediumSetFactory implements IFactory{
    @Override
    public IBurger createBurger() {
        return new DoubleBurger();
    }

    @Override
    public ICombo createCombo() {
        return new MediumCombo();
    }
}
