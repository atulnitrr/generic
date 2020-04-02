package com.atul.generic.generic.service.pqueue;

import com.atul.generic.generic.pojo.Author;
import com.atul.generic.generic.pojo.MyAnnotaion;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    @Test
    void test_java_class() {
        try {
            final Class<Peerson> personClass = (Class<Peerson>) Class.forName("com.atul.generic.generic.pojo.Book");
//            System.out.println(personClass.getName());
//            System.out.println(personClass.getPackage());
            final Field[] fields = personClass.getFields();
//            for (Field field : fields) {
//                System.out.println(field.getName() + " " + field.getType());
//            }

            Method[] methods = personClass.getMethods();
            for (Method m : methods) {
                System.out.println(m.getName() + " --> " + m.getReturnType());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test_Reflection() {
        try {
            final Class<Author> authorClass = (Class<Author>) Class.forName("com.atul.generic.generic.pojo.Author");
            Field[] fields = authorClass.getDeclaredFields();
            for (final Field field : fields) {
                System.out.println(field.getName() + " " + field.getType());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    void test_Dummy() {
        try {
            final Class<Author> authorClass = (Class<Author>) Class.forName("com.atul.generic.generic.pojo.Author");
            final Method[] methods = authorClass.getMethods();
            for (Method method : methods) {
                System.out.println(method.getName() + " --> " + method.getReturnType());
                if (method.isAnnotationPresent(MyAnnotaion.class)) {
                    System.out.println("Found");
                    System.out.println(method.getName() + " --> " + method.getReturnType());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
