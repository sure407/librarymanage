    package org.example;


public class BooksDetails extends Item{
        private String publishYear;
        private int stock;

public BooksDetails(int bookId, String title, String author, double price, String publishYear, int stock)
    {
            super(title,author,price);
            this.publishYear = publishYear;
            this.stock = stock;
    }

public void displayBook(){
       System.out.println("Book id is: "+bookId+", Book Title is:  "+title + ", Book Author Name is: "+author+ ", Book Price is: "+price + ", Book Publish Year is: "+publishYear+ ", Book Available Stock is: "+stock+ ", Book added date: "+addedDate );
}
            public String getPublishYear(){
                    return publishYear;
                }
                    public void setPublishYear(String publishYear){
                        this.publishYear = publishYear;
                    }
                public int getStock(){
                    return stock;
                }
                    public void setStock(int stock){
                        this.stock = stock;
                    }

}




