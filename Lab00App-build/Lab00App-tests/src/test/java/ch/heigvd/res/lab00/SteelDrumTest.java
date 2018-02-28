package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

public class SteelDrumTest {

    @Test
    public void anSteelDrumShouldMakeBadum() {
        IInstrument steelDrum = new SteelDrum();
        String sound = steelDrum.play();
        Assert.assertEquals("badum", sound);
    }

}
