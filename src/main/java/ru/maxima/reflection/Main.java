package ru.maxima.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Person sergey = new Person("Sergey", 25);

        Class classPerson = Person.class;

        Class<? extends Person> aClass = sergey.getClass();

        try {
            Class bClass = Class.forName("ru.maxima.reflection.Person");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String name = classPerson.getName();
        Package aPackage = classPerson.getPackage();
        Field[] fields = classPerson.getFields();
        Method[] methods = classPerson.getMethods();

        for (Method m : methods) {
            System.out.println(m);
        }

        Field[] declaredFields = classPerson.getDeclaredFields();

        for (Field f: declaredFields) {
            System.out.println(f);
        }

    }
}
