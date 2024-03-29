package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                        "applicationContext.xml"
        );

        RadioPlayer radioPlayer1 = context.getBean("idRadioPlayer", RadioPlayer.class);
        RadioPlayer radioPlayer2 = context.getBean("idRadioPlayer", RadioPlayer.class);

        boolean isRadioPlayersEquals = radioPlayer1 == radioPlayer2;

        System.out.println("AM frequency if this radio is  " + radioPlayer1.getFrequencyAM());
        System.out.println("FM frequency if this radio is  " + radioPlayer1.getFrequencyFM());
        radioPlayer1.playRadio();


        System.out.println(isRadioPlayersEquals);

        context.close();

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
    }
}
