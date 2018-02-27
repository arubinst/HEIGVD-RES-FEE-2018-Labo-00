package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BanjoTest {
    @Test
    public void thereShouldBeABanjoClass() {
        IInstrument banjo = new Banjo();
        assertNotNull(banjo);
    }

    @Test
    public void itShouldBePossibleToPlayABanjo() {
        IInstrument banjo = new Banjo();
        String sound = banjo.play();
        assertNotNull(sound);
    }

    @Test
    public void aClavierShouldMakeDongDlong() {
        IInstrument banjo = new Banjo();
        String sound = banjo.play();
        Assert.assertEquals("dong dlong", sound);
    }

    @Test
    public void aBanjoShouldNotBeMute() {
        IInstrument banjo = new Banjo();
        int banjoVolume = banjo.getSoundVolume();
        Assert.assertTrue(banjoVolume > 0);
    }

    @Test
    public void aClavierShouldBeFir() {
        IInstrument banjo = new Banjo();
        String color = banjo.getColor();
        Assert.assertEquals("fir", color);
    }
}
