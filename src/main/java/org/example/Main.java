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
            System.out.println("Press 5- Delete a Book: ");
            System.out.println("Press 6- Do you want to Exit....");
            System.out.println("Choose and Option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> library.addBook(sc);
                case 2 -> library.displayItems();
                case 3 -> library.sellBook(sc);
                case 4 -> library.displaySalesHistory();
                case 5 -> library.deleteBook(sc);
                case 6 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice try Again...");
            }
        }
    }
}