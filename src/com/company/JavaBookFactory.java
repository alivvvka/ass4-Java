package com.company;

public class JavaBookFactory implements IBookFactory{
    @Override
    public IBook createBook() {
        return new JavaBook();
    }
}
