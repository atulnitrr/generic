package com.atul.generic.generic.service.pqueue;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Peerson implements Comparable<Peerson> {

    private String name;
    private int age;

    @Override
    public int compareTo(Peerson o) {
        return Integer.compare(this.age, o.age);
    }
}
