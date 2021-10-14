package com.company;

public class JavaBook implements IBook{

    @Override
    public String getName() {
        return "Head First Design Patterns";
    }

    @Override
    public String getAuthor() {
        return "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra";
    }

    @Override
    public String getYear() {
        return "Released October 2004";
    }

    @Override
    public String getText() {
        return "This edition of Head First Design Patterns—now updated for Java 8—shows you...";
    }
}
