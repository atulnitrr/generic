package com.atul.generic.generic.service;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HtableTest {

    @Test
    void test_1() {
        final Htable<String, Integer> stringIntegerHtable = new Htable<>("atul", 77);
        System.out.println(stringIntegerHtable.toString());;
    }
}