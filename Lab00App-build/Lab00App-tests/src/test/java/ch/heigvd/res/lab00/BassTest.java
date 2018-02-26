/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author migue
 */
public class BassTest {
     @Test
  public void thereShouldBeABassClass() {
    IInstrument bass = new Bass();
    assertNotNull(bass);
  }
  
  @Test
  public void itShouldBePossibleToPlayABass() {
    IInstrument bass = new Bass();
    String sound = bass.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aBassShouldMakeTeon() {
    IInstrument bass = new Bass();
    String sound = bass.play();
    Assert.assertEquals("teon", sound);
  }
  
  @Test
  public void aBassShouldNotBeMute() {
    IInstrument bass = new Bass();
    int bassVolume = bass.getSoundVolume();
    Assert.assertTrue(bassVolume > 7);
  }

  @Test
  public void aBassShouldBeTheColorYouWant() {
    IInstrument bass = new Bass();
    String color = bass.getColor();
    assertNotNull(color);
  }
}
