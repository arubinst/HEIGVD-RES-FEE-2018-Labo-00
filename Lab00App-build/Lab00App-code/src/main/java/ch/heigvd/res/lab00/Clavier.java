package ch.heigvd.res.lab00;

/**
 * Created by elien on 19.02.2018.
 */
public class Clavier extends IInstrument {
    @Override
    public int getSoundVolume() {
        return 10;
    }

    @Override
    public String play() {
        return "dayyyn";
    }

    @Override
    public String getColor() {
        return "ivory";
    }
}
