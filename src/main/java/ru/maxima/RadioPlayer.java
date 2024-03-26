package ru.maxima;

interface Radio {
    String getCurrentSong();
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

public class RadioPlayer {

    private Radio radio;

    public RadioPlayer(Radio radio) {
        this.radio = radio;
    }

    public void playRadio() {
        System.out.println(radio.getCurrentSong());
    }
}
