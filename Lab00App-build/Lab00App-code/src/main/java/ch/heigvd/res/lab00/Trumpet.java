package ch.heigvd.res.lab00;

/**
 * Created by elien on 20.02.2018.
 */
public class Trumpet extends IInstrument {
    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public int getSoundVolume() {
        return 100;
    }

    @Override
    public String play() {
        return "pouet";
    }
}
