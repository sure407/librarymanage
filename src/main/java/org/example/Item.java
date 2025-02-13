package org.example;

import java.time.LocalDate;

public abstract class Item {
    private static int bookIdCounter = 1 ;
    protected int bookId;
    protected String title;
    protected String author;
    protected double price;
    protected LocalDate addedDate;

    public Item(String title, String author, double price) {
        this.bookId = generatebookId();
        this.title = title;
        this.author = author;
        this.price = price;
        this.addedDate = LocalDate.now();
    }

    private int generatebookId(){
        return bookIdCounter++;
    }
    //getter's and setter's
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract void displayBook();

}






