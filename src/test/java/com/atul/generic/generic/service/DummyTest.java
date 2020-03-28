package com.atul.generic.generic.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyTest {

    Dummy dummy;

    @BeforeEach
    void setUp() {
        dummy = new Dummy();
    }

    @Test
    void test_3() {
        dummy.show(34);
    }

    @Test
    void test_5() {
        dummy.show(89.908);
    }

    @Test
    void dummy_2() {
        dummy.dummy("app subah 7 baje utha dena");
    }

    @Test
    void test_9() {
        final Integer[] array = {1, 2, 3, 4, 5};
        dummy.showArray(array);

    }

    @Test
    void test_10() {
        final String[] array = {"aa", "bb", "cc"};
        dummy.showArray(array);

    }
}