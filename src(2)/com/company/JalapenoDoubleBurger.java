package com.company;

public class JalapenoDoubleBurger implements IBurger{
    @Override
    public double getCost() {
        return 1199.99;
    }

    @Override
    public void addCombo(ICombo combo) {
        System.out.println(combo.getDesc() + " have been added! (current price - " + (combo.getCost() + this.getCost()) + " TG)\n");
    }

    @Override
    public String getDesc() {
        return "Jalapeno burger with two cutlets";
    }
}
