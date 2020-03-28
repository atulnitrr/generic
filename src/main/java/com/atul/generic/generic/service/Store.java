package com.atul.generic.generic.service;

public class Store<T> {

    private T item;

    public Store(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Store{" +
                "item=" + item +
                '}';
    }
}
