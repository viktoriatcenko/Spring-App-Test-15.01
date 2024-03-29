package ru.maxima.reflection;

public class Person {

    // Класс
    // имя класса
    // имя пакета
    // поля
    // методы


    // Class:
    // name
    // name of package
    // list of attributes
    // list of methods


    // Class {
    // String name;
    // String packageName
    // List<Attribute> attributes
    // List<Method> methods
    // }

    private String name;
    private Integer age;

    public String surname;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
