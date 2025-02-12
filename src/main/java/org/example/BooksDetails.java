    package org.example;

    public class BooksDetails
    {
// intialize variables
        private String title;
        private String author;
        private double price;
        private String publishYear;
        private int stock;

//create constructor
        public BooksDetails(String title, String author, double price, String publishYear, int stock)
        {
         this.title = title;
         this.author = author;
         this.price = price;
         this.publishYear = publishYear;
         this.stock = stock;
        }
                public String getTitle(){
                    return title;
                }
                    public void setTitle(String title){
                        this.title= title;
                    }
                public String getAuthor(){
                    return author;
                }
                    public void setAuthor(String author){
                        this.author = author;
                    }
                public double getPrice(){
                    return price;
                }
                    public void setPrice(double price){
                        this.price = price;
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

// create method to display books details
        public void displayBooks(){
            System.out.println("Book Title is:  "+title + ", Book Author Name is: "+author+ ", Book Price is: "+price + ", Book Publish Year is: "+publishYear+ ", Book Available Stock is: "+stock );
        }

    }
