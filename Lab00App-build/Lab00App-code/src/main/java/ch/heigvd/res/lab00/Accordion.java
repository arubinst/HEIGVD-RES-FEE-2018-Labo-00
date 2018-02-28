/**
 * Created by aebischerle on 19.02.18.
 */
public class Accordion implements IInstrument {
    @Override
    public String play() {
        return "PFF";
    }

    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public int getSoundVolume() {
        return 50;
    }
}