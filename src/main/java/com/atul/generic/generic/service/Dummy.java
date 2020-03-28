package com.atul.generic.generic.service;

public class Dummy {

    public <T> void dummy(final T t) {
        System.out.println(t.toString());
    }

    public <T> void show(T t) {
        System.out.println(t.toString());
    }

    public <T> void  showArray(T[] array) {
        for (final T t : array)  {
            System.out.print(t.toString() + "-> ");
        }
    }



}

