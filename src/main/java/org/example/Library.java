package org.example;


import java.util.ArrayList;

public class Library {

//create collection
private ArrayList <BooksDetails> books = new ArrayList<>();

//create method to add books details
    public void addBook(BooksDetails book){
        books.add(book);
        System.out.println("Books adding successfully. ");
    }

//create method to show books details
    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("Books are not added, kindly first add books.");
            return;
        }
            for (BooksDetails book : books){
                book.displayBooks();
            }
        }
}

