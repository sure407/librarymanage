


import java.util.ArrayList;

public class Library {

    //create collection
    private ArrayList <BooksDetails> books = new ArrayList<>();
    private ArrayList<SalesRecord> salesHistory = new ArrayList<>();

    //create method to add books details
    public void addBook(BooksDetails book){
        books.add(book);
        System.out.println("Books adding successfully. ");
    }

    //create method to show books details
    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("Books are not added, kindly first add books.");

        }else {
        for (BooksDetails book : books){
            book.displayBooks();
        }
    }
}

// Sell a book
public void sellBook(int bookId, String buyerName) {
    for (BooksDetails book : books) {
        if (book.getBookId() == bookId) {
            if (book.getStock() > 0) {
                book.setStock(book.getStock() - 1);
                SalesRecord sale = new SalesRecord(bookId, book.getTitle(), buyerName, book.getPrice());
                salesHistory.add(sale);
                System.out.println("Book sold successfully!");
                return;
            } else {
                System.out.println("Out of stock!");
                return;
            }
        }
    }
    System.out.println("Book ID not found!");
}

// Display sales history
public void displaySalesHistory() {
    if (salesHistory.isEmpty()) {
        System.out.println("No sales history available.");
    } else {
        for (SalesRecord sale : salesHistory) {
            sale.displaySale();
        }
    }
}
}