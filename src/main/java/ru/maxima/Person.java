package ru.maxima;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {

    public void onStart() {
        System.out.println("Start of creating bean of Person");
    }

    private String name;
    private Integer age;

    public void onFinish() {
        System.out.println("Start of destroying bean of Person");
    }

}
