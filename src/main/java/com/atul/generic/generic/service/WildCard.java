package com.atul.generic.generic.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class WildCard {

    public void add(final Collection<?>  collection) {
        collection.forEach(co -> System.out.print(co.toString() + "--> "));
    }



    public Double addI(final List<? extends Number> numbers) {
        double value = 0.0;
        for (final Number number : numbers) {
            value += number.doubleValue();
        }
        return value;
    }

    public void dummy() {
        List<? super Integer> list = new ArrayList<Integer>();
        List<? super Integer> list1 = new ArrayList<Number>();
        List<? super Integer> list2 = new ArrayList<Object>();
    }

    public void superDummy(final List<? super Number> num) {

        num.add(12);
        num.add(23.90);

        for (final Object o : num) {
            System.out.print( o  + "--> ");
        }
    }








}
