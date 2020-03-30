package com.atul.generic.generic.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class WildCardTest {

    private WildCard wildCard;

    @BeforeEach
    void setUp() {
        wildCard = new WildCard();
    }


    @Test
    void test_1() {
        wildCard.add(Arrays.asList(1, 2, 3, 4));
    }

    @Test
    void test_add_D() {
        System.out.println(wildCard.addI(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    void test_add_n() {
        System.out.println(wildCard.addI(Arrays.asList(1.3, 2.5)));
    }

    @Test
    void test_Somedummy() {
        wildCard.superDummy(new ArrayList<Number>());
    }
}