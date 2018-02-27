package ch.heigvd.res.lab00;

/**
 * This is a very simple class used to demonstrate the specify-implement-validate
 * cycle. All methods used in the JUnit test are defined, so the test class will
 * compile. There is a bug in the add method, so one of the tests is expected
 * to fail.
 * 
 * If you look at the class named ch.heigvd.res.lab01.ApplicationTest, you will
 * find an executable specification for this class. The test methods specify
 * the expected behavior for this class.
 * 
 * @author Olivier Liechti
 */
public class Mandolin implements IInstrument{
  // Variables privés de la classe Mandolin
  private int vol = 5;
  private String color = "wood";
  private String sound = "pick";

  // Constructeur par défaut
  public Mandolin(){}

  // Pour les override => CF interface IInstrument
  @Override
  public int getSoundVolume() {
    return vol;
  }

  @Override
  public String getColor() {
    return color;
  }

  @Override
  public String play() {
    return sound;
  }
}
