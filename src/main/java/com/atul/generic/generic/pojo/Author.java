package com.atul.generic.generic.pojo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Author {

    private String name;
    public Integer id;

    @MyAnnotaion(name = "ddd")
    public void someDummy() {

    }


    public void tt() {

    }


}

