package ru.maxima;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    private Double frequencyAM;
    private Double frequencyFM;

    @Autowired
    public void setRadio1(Radio radio1) {
        this.radio1 = radio1;
    }


    public void playRadio() {
        System.out.println(radio1.getCurrentSong());
    }
}
