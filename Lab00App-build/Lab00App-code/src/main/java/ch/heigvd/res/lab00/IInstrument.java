package ch.heigvd.res.lab00;

/**
 * Created by elien on 19.02.2018.
 */
public class IInstrument {

    private int soundVolume = 0;
    private String color = "white";

    public String play() {
        return "hello";
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public String getColor() {
        return color;
    }
}
