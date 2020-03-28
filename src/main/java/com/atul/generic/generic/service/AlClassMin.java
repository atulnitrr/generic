package com.atul.generic.generic.service;

public class AlClassMin {

    public <T extends  Comparable<T>>  T getMin(final T t1, final T t2) {
        return t1.compareTo(t2) < 0 ? t1 : t2;

    }
}
