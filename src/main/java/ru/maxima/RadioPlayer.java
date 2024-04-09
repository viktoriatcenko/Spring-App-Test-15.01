package ru.maxima;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

interface Radio {
    String getCurrentSong();
}

class RadioDacha implements Radio {

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public String getCurrentSong() {
        return song;
    }
}

class RadioDynamit implements Radio{

    private String song;

    public RadioDynamit(String song) {
        this.song = song;
    }

    @Override
    public String getCurrentSong() {
        return song;
    }
}

@Component
class RadioMaximum implements Radio {

    @Override
    public String getCurrentSong() {
        return "RHCP - Californication";
    }
}

class RadioEnergy implements Radio {

    @Override
    public String getCurrentSong() {
        return "Avicii - Levels";
    }
}

@Getter
@Component
public class RadioPlayer {
    private Radio radio1;

    @Value("${frequencyAM}")
    private Double frequencyAM;

    @Value("${frequencyFM}")
    private Double frequencyFM;


    @Autowired
    public void setRadio1(Radio radio1) {
        this.radio1 = radio1;
    }
    @PostConstruct
    public void onStart() {
        System.out.println("Start of creating bean of Person");
    }


    @PreDestroy
    public void onFinish() {
        System.out.println("Start of destroying bean of Person");
    }


    public void playRadio() {
        System.out.println(radio1.getCurrentSong());
        System.out.println(this.frequencyAM);
        System.out.println(this.frequencyFM);
    }
}
