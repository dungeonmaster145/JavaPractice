package com.Java8Practice;

import java.util.List;

public class BookDao {

    public List<Book> BookList(){

        return List.of(
                new Book(1,"Harry Potter","JK Rowling"),
                new Book(2,"CAS","JK"),
                new Book(3,"KHSB","jaskd")
        );
    }
}
