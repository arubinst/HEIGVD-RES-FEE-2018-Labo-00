/* guillaume Schranz*/

package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class SaxophoneTest {

  
  @Test
  public void aSaxophoneShouldMakeFuuu() {
    IInstrument saxophone = new Saxophone();
    String sound = saxophone.play();
    Assert.assertEquals("fuuu", sound);
  }
}

