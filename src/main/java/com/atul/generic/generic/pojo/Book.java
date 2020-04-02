package com.atul.generic.generic.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book implements Comparable<Book> {
    private String title;
    private String authorName;
    private int numOfBooks;

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);

//        return this.authorName.compareTo(o.authorName);

//        return -Integer.compare(numOfBooks, o.numOfBooks);
    }

    public static class TitileComaprator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.title.compareTo(o2.title);
        }
    }

    public static class AuthorComaprator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.authorName.compareTo(o2.authorName);
        }
    }

    public static class PageComaprator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return Integer.compare(o1.numOfBooks, o2.numOfBooks);
        }
    }
}
