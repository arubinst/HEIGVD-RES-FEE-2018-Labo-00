package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

public class CarillonTest {

  
  @Test
  public void aCarillonShouldMakeTingTang() {
    IInstrument carillon = new Carillon();
    String sound = carillon.play();
    Assert.assertEquals("ting tang", sound);
  }

}

