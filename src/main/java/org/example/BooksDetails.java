    package org.example;


public class BooksDetails extends Item{
        private String publishYear;
        private int stock;

public BooksDetails(int bookId, String title, String author, double price, String publishYear, int stock)
    {
            super(bookId,title,author,price);
            this.publishYear = publishYear;
            this.stock = stock;
    }

public void displayBook(){
       System.out.println("Book id is: "+bookId+", Book Title is:  "+title + ", Book Author Name is: "+author+ ", Book Price is: "+price + ", Book Publish Year is: "+publishYear+ ", Book Available Stock is: "+stock );
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




//    public class BooksDetails
//    {
//// intialize variables
//        private int bookId;
//        private String title;
//        private String author;
//        private double price;
//        private String publishYear;
//        private int stock;
//        private LocalDate addedDate;
//
//
////create constructor
//        public BooksDetails(int bookId, String title, String author, double price, String publishYear, int stock)
//        {
//         this.bookId = bookId;
//         this.title = title;
//         this.author = author;
//         this.price = price;
//         this.publishYear = publishYear;
//         this.stock = stock;
//         this.addedDate = LocalDate.now();
//        }
//                public int getBookId(){return bookId;}
//                public void setBookId(int bookId){this.bookId=bookId;}
//                public String getTitle(){
//                    return title;
//                }
//                    public void setTitle(String title){
//                        this.title= title;
//                    }
//                public String getAuthor(){
//                    return author;
//                }
//                    public void setAuthor(String author){
//                        this.author = author;
//                    }
//                public double getPrice(){
//                    return price;
//                }
//                    public void setPrice(double price){
//                        this.price = price;
//                    }
//                public String getPublishYear(){
//                    return publishYear;
//                }
//                    public void setPublishYear(String publishYear){
//                        this.publishYear = publishYear;
//                    }
//                public int getStock(){
//                    return stock;
//                }
//                    public void setStock(int stock){
//                        this.stock = stock;
//                    }
//
//// create method to display books details
//        public void displayBooks(){
//            System.out.println("Book id is: "+bookId+", Book Title is:  "+title + ", Book Author Name is: "+author+ ", Book Price is: "+price + ", Book Publish Year is: "+publishYear+ ", Book Available Stock is: "+stock );
//        }
//
//    }
