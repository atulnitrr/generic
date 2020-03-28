package com.atul.generic.generic.service;

public class Htable<K, V> {

    private K key;
    private V value;

    public Htable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Htable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
