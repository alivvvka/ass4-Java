package com.company;

public class SmallCombo implements ICombo{

    @Override
    public double getCost() {
        return 399.99;
    }

    @Override
    public String getDesc() {
        return "Small fries and 0.3 Cola";
    }
}
