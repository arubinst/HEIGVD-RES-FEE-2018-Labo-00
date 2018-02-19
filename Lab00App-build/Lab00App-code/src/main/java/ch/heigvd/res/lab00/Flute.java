package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

    /*
    Membres privés
     */
    private String sound;
    private int volume;
    private String color;

    /*
    Getters
     */
    @Override
    public String play() {
        return sound;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    /*
    Setters
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*
    Constructeur
     */
    public Flute() {
       this.volume = 35;
    }
}
