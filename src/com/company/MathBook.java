package com.company;

public class MathBook implements IBook{

    @Override
    public String getName() {
        return "The Math Book";
    }

    @Override
    public String getAuthor() {
        return "Clifford A. Pickover";
    }

    @Override
    public String getYear() {
        return "07 Feb 2012";
    }

    @Override
    public String getText() {
        return "2 + 2 = 4";
    }
}
