package org.example;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello This is Library Management System");
// create object of library and user input
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
//show screen to user
        while (true) {
            System.out.println("Press 1- Enter Add Books");
            System.out.println("Press 2- See Already added Books");
            System.out.println("Press 3- If you Sell a Book: ");
            System.out.println("Press 4- View Sell Book Details: ");
            System.out.println("Press 5- Do you want to Exit: ");
            System.out.println("Choose and Option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> library.addBook(sc);
                case 2 -> library.displayItems();
                case 3 -> library.sellBook(sc, library);
                case 4 -> library.displaySalesHistory();
                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice try Again...");
            }
        }
    }

//    private static void addBook(Scanner sc, Library library) {
//        System.out.println("Enter the book Id: ");
//        int bookId = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Enter the book Title: ");
//        String title = sc.nextLine();
//
//        System.out.println("Enter the book Author: ");
//        String author = sc.nextLine();
//
//        System.out.println("Enter the book Price: ");
//        Double price = sc.nextDouble();
//
//        sc.nextLine();
//
//        System.out.println("Enter the book Publication Year in YYYY format: ");
//        String publishYear = sc.nextLine();
//
//        System.out.println("Enter the book available Stock: ");
//        Integer stock = sc.nextInt();
//
//        BooksDetails book = new BooksDetails(bookId, title, author, price, publishYear, stock);
//        library.addItem(book);
//    }
//    private static void sellBook(Scanner sc, Library library){
//        System.out.println("Enter Book Id for Sell Book: ");
//        int bookId = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Enter the Buyer Name: ");
//        String buyerName = sc.nextLine();
//        library.sellItem(bookId, buyerName);
//
//    }

}