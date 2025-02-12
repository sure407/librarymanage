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
            System.out.println("Press 3- If you want to Exit: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter the book Title: ");
                String title = sc.nextLine();

                System.out.println("Enter the book Author: ");
                String author = sc.nextLine();

                System.out.println("Enter the book Price: ");
                Double price = sc.nextDouble();

                sc.nextLine();

                System.out.println("Enter the book Publication Year in YYYY format: ");
                String publishYear = sc.nextLine();

                System.out.println("Enter the book available Stock: ");
                Integer stock = sc.nextInt();

                library.addBook(new BooksDetails(title, author, price, publishYear, stock));
            } else if (choice == 2) {
                library.displayBooks();
            } else {
                System.out.println("Exits");
                break;
            }
        }
        sc.close();
    }
}