package com.company;

public class MathBookFactory implements IBookFactory{
    @Override
    public IBook createBook() {
        return new MathBook();
    }
}
