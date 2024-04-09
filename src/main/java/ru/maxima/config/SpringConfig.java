package ru.maxima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.maxima.Person;
import ru.maxima.model.Cat;
import ru.maxima.model.Dog;

@Configuration
@ComponentScan("ru.maxima")
@PropertySource("classpath:player.properties")
public class SpringConfig {


    @Bean
    public Cat idOfCat() {
        return new Cat("persian", 5);
    }

    @Bean
    public Dog idOfDog() {
        return new Dog(1.6,6.5);
    }

}
