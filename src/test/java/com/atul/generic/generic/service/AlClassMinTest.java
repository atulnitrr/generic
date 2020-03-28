package com.atul.generic.generic.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlClassMinTest {


    AlClassMin alClassMin;

    @BeforeEach
    void setUp() {
        alClassMin = new AlClassMin();
    }

    @Test
    void test_2() {
        System.out.println(alClassMin.getMin(34, 12));
    }

    @Test
    void test_3() {
        System.out.println(alClassMin.getMin("ab", "cd"));
    }

    @Test
    void test_4() {
        System.out.println(alClassMin.getMin(30.89, 22.56));
    }


}