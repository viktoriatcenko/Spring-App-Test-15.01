package ru.maxima;

import lombok.Getter;
import lombok.Setter;

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

class RadioMaximum implements Radio {

    private String song;

    public RadioMaximum(String song) {
        this.song = song;
    }

    @Override
    public String getCurrentSong() {
        return song;
    }
}

class RadioEnergy implements Radio {

    public RadioEnergy(String song) {
        this.song = song;
    }

    private String song;
    @Override
    public String getCurrentSong() {
        return song;
    }
}

@Getter
@Setter
public class RadioPlayer {
    private Radio radio;
    private Double frequencyAM;
    private Double frequencyFM;


    public void playRadio() {
        System.out.println(radio.getCurrentSong());
    }
}
