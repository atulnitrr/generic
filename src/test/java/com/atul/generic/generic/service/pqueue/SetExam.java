package com.atul.generic.generic.service.pqueue;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExam {

    @Test
    void test_has() {
        final Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(45);
        integerSet.add(67);
        integerSet.add(45);
        integerSet.remove(45);
        System.out.println(integerSet);
    }
}
