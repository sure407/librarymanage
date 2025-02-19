package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Library implements Businesslogic{

    //create collection
    private final  ArrayList<Item> items = new ArrayList<>();
    private  final ArrayList<SalesRecord> salesHistory = new ArrayList<>();

    // correct code above
    public  void addBook(Scanner sc) {

        System.out.println("Enter the book Title: ");
        String title = sc.nextLine();

        System.out.println("Enter the book Author name: ");
        String author = sc.nextLine();

        System.out.println("Enter the book Price: ");
        double price = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter the book Publication Year in YYYY format: ");
        String publishYear = sc.nextLine();

        System.out.println("Enter the book Stock/quantity: ");
        int stock = sc.nextInt();

        BooksDetails book = new BooksDetails(title, author, price, publishYear, stock);
        items.add(book);
        System.out.println("Books adding successfully.");
    }


    // correct code below

    //create method to show books details
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Books are not added, kindly first add books.");
            return;

        }


        List<BooksDetails> availableBooks = items.stream()
                .filter(item-> item instanceof BooksDetails)
                .map(item -> (BooksDetails) item)
                .filter(book-> book.getStock()>0)
                .toList();
        if (availableBooks.isEmpty()){
            System.out.println("All books sold out.. Please add more books...");
        }
        else {
                    availableBooks.forEach(BooksDetails::displayBook);
        }
    }


    public void sellBook(Scanner sc){
        if (items.isEmpty()){
            System.out.println("No books available to sale...");
            return;
        }
        displayItems();
        System.out.println("Enter Book Id to sale...");
        int bookId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Quantity...");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Buyer Name...");
        String buyerName = sc.nextLine();
        sc.nextLine();

        items.stream()
                .filter(item -> item instanceof BooksDetails)
                .map(item -> (BooksDetails) item)
                .filter(book-> book.getBookId()==bookId)
                .findFirst()
                .ifPresentOrElse(book -> {
                    if (book.getStock()>= quantity){
                        book.setStock(book.getStock()-quantity);
                    salesHistory.add(new SalesRecord(bookId, book.getTitle(), buyerName, quantity,book.getPrice()));
                    System.out.println("Successfully sold "+ quantity + " books..");
                    }
                else {
                        System.out.println("Out of Stock: Available Only " + book.getStock()+ " books...");
                    }
                }, ()-> System.out.println("Book Id not found..."));
    }
    //Delete books code
    public void deleteBook(Scanner sc){
        if (items.isEmpty()){
            System.out.println("No books available to delete...");
            return;
        }
        displayItems();
        System.out.println("Enter book Id to delete:");
        int bookId = sc.nextInt();

        int initialSize = items.size();

        items.removeIf(item-> item.getBookId()==bookId);
        if (items.size()< initialSize) {
            System.out.println("Book deleted successfully..!");
        }
        else {
            System.out.println("Book Id not found.. try again..");
        }


    }


    //Display Sales History
    public void displaySalesHistory(){
        if(salesHistory.isEmpty()){
            System.out.println("No Books Sale History Available...");
        }
        else {
           salesHistory.forEach(SalesRecord::displaySale);
        }
    }
}
