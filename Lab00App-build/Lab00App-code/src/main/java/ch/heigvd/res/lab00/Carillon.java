package ch.heigvd.res.lab00;

public class Carillon implements IInstrument {

    /*
    Membres privés
    */
    private String sound;
    private int volume;
    private String color;

    /*
    Constructeur
     */
    public Carillon() {
        this.sound = "ting tang";
        this.color = "Ebony";
        this.volume = 70;
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
