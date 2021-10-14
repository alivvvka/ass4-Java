package com.company;

public class Main {

    public static void main(String[] args) {
        IBookFactory factory = new JavaBookFactory();
        IBook book = factory.createBook();

        System.out.println(book.getAuthor() + '\n' + book.getName() + '\n' + book.getText() + '\n' + book.getYear());
    }
}
