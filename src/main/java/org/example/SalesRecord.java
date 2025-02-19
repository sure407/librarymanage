    package org.example;



    import java.time.LocalDate;

    public class SalesRecord {
        private final int bookId;
        private final String bookTitle;
        private final String buyerName;
        private final int quantity;
        private final double price;
        private final LocalDate saleDate;

        public SalesRecord(int bookId, String bookTitle, String buyerName, int quantity,double price){
            this.bookId = bookId;
            this.bookTitle = bookTitle;
            this.buyerName = buyerName;
            this.quantity = quantity;
            this.price = price;
            this.saleDate= LocalDate.now();
        }

        public void displaySale(){
            System.out.println("Books Sale Details...");
            System.out.println("Book Id is: "+ bookId);
            System.out.println("Book Title is: "+bookTitle);
            System.out.println("Buyer Name is: "+buyerName);
            System.out.println("Quantity is: "+quantity);
            System.out.println("Book Price is:"+price);
            System.out.println("Book Sale Date is: "+saleDate);
        }
    }