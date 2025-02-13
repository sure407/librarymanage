package org.example;

import java.time.LocalDate;

public abstract class Item {
    protected int bookId;
    protected String title;
    protected String author;
    protected double price;
    protected LocalDate addedDate;

    public Item(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.addedDate = LocalDate.now();
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

//    public String getPublishYear(){
//        return publishYear;
//    }
//    public void setPublishYear(String publishYear){
//        this.publishYear = publishYear;
//    }
//    public int getStock(){
//        return stock;
//    }
//    public void setStock(int stock){
//        this.stock = stock;
//    }




