
package com.mycompany.javapractice;

import java.util.ArrayList;

public class Book {
    
private String  title; 
private String author;
private String ISBN;
private static ArrayList<Book> bookList= new ArrayList<Book>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
  public static void  booksAdd(Book book){
      bookList.add(book);
    }
  public static  void bookRemove(Book book){
      bookList.remove(book);
  }
   
  public static ArrayList<Book> getBookCollection(){
      return bookList;
  }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    

}
