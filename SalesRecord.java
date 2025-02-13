

import java.time.LocalDate;

public class SalesRecord {
    private int bookId;
    private String bookTitle;
    private String buyerName;
    private double price;
    private LocalDate saleDate;

    public SalesRecord(int bookId, String bookTitle, String buyerName, double price) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.buyerName = buyerName;
        this.price = price;
        this.saleDate = LocalDate.now();
    }

    public void displaySale() {
        System.out.println("===========================================");
        System.out.println(" Book ID      : " + bookId);
        System.out.println(" Title        : " + bookTitle);
        System.out.println(" Buyer Name   : " + buyerName);
        System.out.println(" Price        : $" + price);
        System.out.println(" Sale Date    : " + saleDate);
        System.out.println("===========================================\n");
    }
}
