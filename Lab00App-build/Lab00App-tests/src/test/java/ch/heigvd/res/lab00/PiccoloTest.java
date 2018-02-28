package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Abass MAHDAVI
 */


public class PiccoloTest extends Piccolo {
  @Test
  public void thereShouldBeAPiccoloClass() {
    IInstrument piccolo = new Piccolo();
    assertNotNull(piccolo);
  }
  
  @Test
  public void itShouldBePossibleToPlayAPiccolo() {
    IInstrument piccolo = new Piccolo();
    String sound = piccolo.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aPiccoloShouldMakeDayyyn() {
    IInstrument piccolo = new Piccolo();
    String sound = piccolo.play();
    Assert.assertEquals("paihsfiu", sound);
  }
  
  @Test
  public void aPiccoloShouldNotBeMute() {
    IInstrument piccolo = new Piccolo();
    int piccoloVolume = piccolo.getSoundVolume();
    Assert.assertTrue(piccoloVolume > 0);
  }

  @Test
  public void aPiccoloShouldBeIvory() {
    IInstrument piccolo = new Piccolo();
    String color = piccolo.getColor();
    Assert.assertEquals("black", color);
  }
}
