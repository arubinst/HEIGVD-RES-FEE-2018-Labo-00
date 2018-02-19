package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

    /*
    Membres privés
     */
    private String sound;
    private int volume;
    private String color;

    /*
    Constructeur
     */

    public Trumpet() {
        this.sound = "pouet";
        this.volume = 87;
        this.color = "golden";
    }

    /*
    Méthodes publiques
     */
    @Override
    public String play() {
        return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        return color;
    }
}
