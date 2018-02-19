package ch.heigvd.res.lab00;

public class Harmonica implements IInstrument {

    /*
    Membres privés
     */
    private String sound;
    private int volume;
    private String color;

    /*
    Constructeur
     */

    public Harmonica() {
        this.sound = "dap dap";
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
