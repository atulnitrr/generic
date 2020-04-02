package com.atul.generic.generic.service.pqueue;

import com.atul.generic.generic.pojo.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExam {

    @Test
    void test_java() {
        final int[] array = {2, 4, 3, 1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    @Test
    void test_56() {
        final List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Harry Pottet", "Agtha ", 34));
        bookList.add(new Book("Aeter partke  Pottet", "randopm ", 4));
        bookList.add(new Book("Dummy", "run  ", 14));
        Collections.sort(bookList);
        System.out.println(bookList);

    }

    @Test
    void test_55() {
        final List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Harry Pottet", "a ", 34));
        bookList.add(new Book("Aeter partke  Pottet", "c ", 4));
        bookList.add(new Book("Dummy", "b  ", 14));
        Collections.sort(bookList, new Book.AuthorComaprator().reversed());
        System.out.println(bookList);

    }
}
