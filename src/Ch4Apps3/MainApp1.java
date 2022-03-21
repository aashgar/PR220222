/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4Apps3;

import java.util.Arrays;

/**
 *
 * @author aashgar
 */
public class MainApp1 {
    public static void main(String[] args) {
        Library[] books = {new Book("IUG LIB", "Prog 2", 2010, 
                new Author("Abdelkareem"), new Publisher("IEEE")),
            new Book("IUG LIB", "Prog 2", 2019, 
                new Author("Ali"), new Publisher("IEEE"))
        };
        Arrays.sort(books);
        for(Library book: books)
            book.showData();
    }
}
