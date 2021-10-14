package com.company;

public class SmallBurger implements IBurger{
    @Override
    public double getCost() {
        return 699.99;
    }

    @Override
    public void addCombo(ICombo combo) {
        System.out.println(combo.getDesc() + " have been added! (current price - " + (combo.getCost() + this.getCost()) + " TG)\n");
    }

    @Override
    public String getDesc() {
        return "Burger with one cutlet";
    }
}
