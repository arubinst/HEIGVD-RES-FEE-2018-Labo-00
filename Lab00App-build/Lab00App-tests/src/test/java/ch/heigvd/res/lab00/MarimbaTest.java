package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by elien on 26.02.2018.
 */
public class MarimbaTest {
    @Test
    public void thereShouldBeAMarimbaClass() {
        IInstrument marimba = new Marimba();
        assertNotNull(Marimba);
    }

    @Test
    public void itShouldBePossibleToPlayAMarimba() {
        IInstrument marimba = new Marimba();
        String sound = marimba.play();
        assertNotNull(sound);
    }

    @Test
    public void aMarimbaShouldMakeDayyyn() {
        IInstrument marimba = new Marimba();
        String sound = marimba.play();
        Assert.assertEquals("ting", sound);
    }

    @Test
    public void aMarimbaShouldNotBeMute() {
        IInstrument marimba = new Marimba();
        int marimbaVolume = marimba.getSoundVolume();
        Assert.assertTrue(marimbaVolume > 0);
    }

    @Test
    public void aMarimbaShouldBeIvory() {
        IInstrument marimba = new Marimba();
        String color = marimba.getColor();
        Assert.assertEquals("metal", color);
    }
}
