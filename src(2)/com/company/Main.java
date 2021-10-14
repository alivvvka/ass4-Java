package com.company;

public class Main {

    public static void main(String[] args) {
	    IFactory factory = new BigSetFactory();
	    IBurger burger = factory.createBurger();
	    ICombo combo = factory.createCombo();


        System.out.print("\n" + burger.getDesc() + " - ");
        System.out.println(burger.getCost() + "TG");
        burger.addCombo(combo);
    }
}
