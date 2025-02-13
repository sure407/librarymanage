


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    //create collection
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<SalesRecord> salesHistory = new ArrayList<>();

    // correct code above
    public  void addBook(Scanner sc) {



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

            for (Item item : items) {
                if (item instanceof BooksDetails) {
                    BooksDetails book = (BooksDetails) item;
                    if (book.getStock()>0){
                    book.displayBook();
                }

            }
        }
    }

    public void sellBook(Scanner sc, Library library){
        if (items.isEmpty()) {
            System.out.println("No books available for sale. Please add books first.");
            return;
        }

        System.out.println("Available books:");
        displayItems();

        System.out.println("Enter Book Id for Sell Book: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the Buyer Name: ");
        String buyerName = sc.nextLine();
        library.sellItem(bookId, buyerName);

    }

    //Sell book
    public void sellItem(int bookId, String buyerName){
        for (Item item: items){
            if (item instanceof BooksDetails){ //type checking
                BooksDetails book = (BooksDetails) item; //downcasting
                if(book.getBookId()==bookId && book.getStock()>0){


                    book.setStock(book.getStock()-1);
                    SalesRecord sale = new SalesRecord(bookId, book.getTitle(), buyerName, book.getPrice());
                    salesHistory.add(sale);
                    System.out.println("Book Sold Successfully");
                    return;
                }
                else if(book.getBookId()==bookId){
                    System.out.println("Your Book is out of stock...");
                    return;
                }
            }
        }
        System.out.println("Book Id not found...");
    }
    //Display Sales History
    public void displaySalesHistory(){
        if(salesHistory.isEmpty()){
            System.out.println("No Books Sale History Available...");
        }
        else {
            for (SalesRecord sale: salesHistory){
                sale.displaySale();
            }
        }
    }
}