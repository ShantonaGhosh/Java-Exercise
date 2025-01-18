
package com.mycompany.javapractice;

import java.util.ArrayList;




public class JavaPractice {

    public static void main(String[] args) {
        
        Book b= new Book("a","b","c");
         Book b1= new Book("d","e","f");
        Book.booksAdd(b);
        Book.booksAdd(b1);
        ArrayList<Book> bookCollection= Book.getBookCollection();
        for(Book book: bookCollection){
            System.out.println(book.getTitle()+ " " + book.getAuthor()+" "+ book.getISBN());
        }
        
        Book.bookRemove(b1);
         for(Book book: bookCollection){
            System.out.println(book.getTitle()+ " " + book.getAuthor()+" "+ book.getISBN());
        }
        
     
    }

}
