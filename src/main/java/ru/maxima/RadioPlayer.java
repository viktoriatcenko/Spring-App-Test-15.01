package ru.maxima;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

@Component
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
    private Radio radio2;
    private Double frequencyAM;
    private Double frequencyFM;

    @Autowired
    public RadioPlayer(@Qualifier("radioEnergy") Radio radio1,
                       @Qualifier("radioMaximum") Radio radio2) {
        this.radio1 = radio1;
        this.radio2 = radio2;
    }

    public void playRadio() {
        System.out.println(radio1.getCurrentSong());
        System.out.println(radio2.getCurrentSong());
    }
}
