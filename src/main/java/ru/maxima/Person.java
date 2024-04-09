package ru.maxima;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.maxima.model.Cat;
import ru.maxima.model.Dog;

@Getter
@Setter
@ToString
@Component("idOfPerson")
public class Person {

    private String name = "Person name";
    private Integer age = 15;

    private final Cat cat;

    private final Dog dog;

    public Person(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }
}
