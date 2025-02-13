    package org.example;


    import java.util.ArrayList;

    public class Library {

        //create collection
        private ArrayList<Item> items = new ArrayList<>();
        private ArrayList<SalesRecord> salesHistory = new ArrayList<>();

        //create method to add books details
        public void addItem(Item item) {
            items.add(item);
            System.out.println("Books adding successfully. ");
        }

        //create method to show books details
        public void displayItems() {
            if (items.isEmpty()) {
                System.out.println("Books are not added, kindly first add books.");
                return;

            }

            else {
                for (Item item : items) {
                    item.displayBook();
                }
            }
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
                    else{
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

