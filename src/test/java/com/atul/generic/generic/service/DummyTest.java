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
    void dummy() {
        dummy.dummy(new Person("atul", "kumar"));
    }



    @Test
    void dummy_2() {
        dummy.dummy("app subah 7 baje utha dena");
    }







}