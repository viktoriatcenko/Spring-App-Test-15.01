package ru.maxima;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.config.SpringConfig;
import ru.maxima.model.Cat;
import ru.maxima.model.Dog;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        RadioPlayer radioPlayer = context.getBean("radioPlayer", RadioPlayer.class);

        Person person = context.getBean("idOfPerson", Person.class);

        System.out.println(person.getCat().getBreed());

        System.out.println(person.getDog().getHeight());


//        Cat cat = context.getBean("idOfCat", Cat.class);
//
//        Dog dog = context.getBean("idOfDog", Dog.class);



//        System.out.println(dog.getHeight());
//
//        System.out.println(dog.getWeight());
//
//        System.out.println(cat.getBreed());
//
//        System.out.println(cat.getAge());
//
//        System.out.println(person);
//
//        radioPlayer.playRadio();

        context.close();









//        RadioPlayer radioPlayer1 = context.getBean("idRadioPlayer", RadioPlayer.class);
//        RadioPlayer radioPlayer2 = context.getBean("idRadioPlayer", RadioPlayer.class);
//
//        boolean isRadioPlayersEquals = radioPlayer1 == radioPlayer2;
//
//        System.out.println("AM frequency if this radio is  " + radioPlayer1.getFrequencyAM());
//        System.out.println("FM frequency if this radio is  " + radioPlayer1.getFrequencyFM());
//        radioPlayer1.playRadio();
//
//
//        System.out.println(isRadioPlayersEquals);
//
//        context.close();

//        Radio radio = context.getBean("idOfRadioMaximum", RadioMaximum.class);
//
//        RadioPlayer player = new RadioPlayer(radio);
//        player.playRadio();
//
//        radio = context.getBean("idOfRadioEnergy", RadioEnergy.class);
//
//        player = new RadioPlayer(radio);
//
//        player.playRadio();

//        Person person = context.getBean("person", Person.class);
//
//        System.out.println(person);
    }
}
