package com.atul.generic.generic.service.typeErausre;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

    public void typeErasure() {

        List<String> list = new ArrayList<>();
        list.add("dddd");
        final String ss = list.get(0);


//        ------

        List list1 = new ArrayList();
        list1.add("sss");
        final String tt = (String) list1.get(0);

        // These two are same JVM converts it back.


    }
}
