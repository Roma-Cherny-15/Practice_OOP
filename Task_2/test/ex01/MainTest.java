package ex01;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import junit.framework.Assert;
import java.io.IOException;
import ex01.Calc;
/** Выполняет тестирование разработанных классов.
 */

public class MainTest {

  @Test
  public void testCalc() {
    Calc calc = new Calc();
    calc.init("+380925277622");
    assertEquals(calc.getResult().getMobileOperator(), "PEOPLEnet");
    calc.show();
    calc.init("+380505336907");
    assertEquals(calc.getResult().getMobileOperator(), "Vodafone");
    calc.show();
    calc.init("+380984007208");
    assertEquals(calc.getResult().getMobileOperator(), "KyivStar");
    calc.show();
    calc.init("+380660111563");
    assertEquals(calc.getResult().getMobileOperator(), "Vodafone");
    calc.show();
    calc.init("+380941989316");
    assertEquals(calc.getResult().getMobileOperator(), "Інтертелеком");
    calc.show();
  }

  

  @Test
  public void testSerialization() {
    System.out.println("Serialization test:");
    Calc calc = new Calc();
    calc.init(calc.GenerateRandomPhoneNumber());
    System.out.println(calc.getResult());
    try {
      calc.save();
      System.out.println("Calculation result saved.");
      calc.setResult(new Item2d());
      calc.restore();
      System.out.println("Calculation result restored.");
      System.out.println("Result:");
      calc.show();
    } catch (Exception e) {
      System.out.println("serialization error: " + e);
    }
  }
}