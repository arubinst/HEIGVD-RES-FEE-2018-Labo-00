package ch.heigvd.res.lab00;

public class Clavier implements IInstrument {

    /*
    Membres privés
     */
    private String color;
    private int clavierVolume;
    private String sound;

    /*
    Constructeur
     */
    public Clavier() {
        this.sound = "dayyyn";
        this.color = "ivory";
        this.clavierVolume = 67;
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
        return clavierVolume;
    }

    public String getColor() {
        return color;
    }
}