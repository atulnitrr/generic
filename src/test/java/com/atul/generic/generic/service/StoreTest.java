package com.atul.generic.generic.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void test_string() {
        final Store<String> stringStore = new Store<>("first item ");
        System.out.println(stringStore.getItem());;
        System.out.println(stringStore.toString());;
    }


    @Test
    void test_3() {
        final Store<Integer> stringStore = new Store<>(2);
        System.out.println(stringStore.getItem());;
        System.out.println(stringStore.toString());;
    }


}