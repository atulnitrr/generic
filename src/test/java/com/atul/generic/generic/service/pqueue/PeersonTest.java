package com.atul.generic.generic.service.pqueue;

import com.atul.generic.generic.service.Person;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class PeersonTest {

    @Test
    void test_1() {
        Queue<Peerson> personQueue = new PriorityQueue<>();
        personQueue.add(new Peerson("aa", 23));
        personQueue.add(new Peerson("mb", 45));
        personQueue.add(new Peerson("mb", 32));
        personQueue.add(new Peerson("mb", 14));
        while (personQueue.peek() != null) {
            System.out.println(personQueue.poll());
        }
    }
}