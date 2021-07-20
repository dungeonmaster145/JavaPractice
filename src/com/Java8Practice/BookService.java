package com.Java8Practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService{

    public List<Book> getInOrder(){

        List<Book> book=new BookDao().BookList();
        Collections.sort(book,new Comaprison());
        return book;
    }

    public static void main (String[] args) {
        System.out.println(new BookService().getInOrder());
    }

}
class Comaprison implements Comparator<Book>{

    public int compare(Book b1,Book b2){
        return b1.getName().compareTo(b1.getName());
    }
}

