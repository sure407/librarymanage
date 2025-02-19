


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

        System.out.println("Enter the book Author name: ");
        String author = sc.nextLine();

        System.out.println("Enter the book Price: ");
        Double price = sc.nextDouble();

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
boolean booksAvailable = false;
            for (Item item : items) {
                if (item instanceof BooksDetails book && book.getStock()>0) {
                    book.displayBook();
                    booksAvailable = true;
                }
            }
            if (!booksAvailable){
                System.out.println("All books sold out.. Please add more books...");
        }
    }

//    public void sellBook(Scanner sc){
//        if (items.isEmpty()) {
//            System.out.println("No books available for sale. Please add books first.");
//            return;
//        }
//
//        System.out.println("Available books:");
//        displayItems();
//
//        System.out.println("Enter Book Id for Sell Book: ");
//        int bookId = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Enter Book Quantity: ");
//        int quantity = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("Enter the Buyer Name: ");
//        String buyerName = sc.nextLine();
//       // library.sellItem(bookId, buyerName);
//
//    }
//
//    //Sell book
//    public void sellItem(){//int bookId, String buyerName){
//        for (Item item: items){
//            if (item instanceof BooksDetails){ //type checking
//                BooksDetails book = (BooksDetails) item; //downcasting
//                if(book.getBookId()==bookId && book.getStock()>0){
//
//
//                    book.setStock(book.getStock()-1);
//                    SalesRecord sale = new SalesRecord(bookId, book.getTitle(), buyerName, quantity ,book.getPrice());
//                    salesHistory.add(sale);
//                    System.out.println("Book Sold Successfully");
//                    return;
//                }
//                else if(book.getBookId()==bookId){
//                    System.out.println("Your Book is out of stock...");
//                    return;
//                }
//            }
//        }
//        System.out.println("Book Id not found...");
//    }


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
        for (Item item : items){
            if (item instanceof BooksDetails book && book.getBookId()==bookId){
                if (book.getStock()>= quantity){
                    book.setStock(book.getStock()-quantity);
                    salesHistory.add(new SalesRecord(bookId, book.getTitle(), buyerName, quantity,book.getPrice()));
                    System.out.println("Successfully sold"+quantity+ " books..");
                }
                else{
                    System.out.println("Out of Stock: Available Only" + book.getStock()+ " books...");
                }
                return;
            }
        }
        System.out.println("Book Id not found..");
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

        int intialSize = items.size();

        items.removeIf(item-> item.getBookId()==bookId);
        if (items.size()< intialSize) {
            System.out.println("Book deleted sucessfully..!");
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
            for (SalesRecord sale: salesHistory){
                sale.displaySale();
            }
        }
    }
}