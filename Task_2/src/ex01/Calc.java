package ex01;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
/** Содержит реализацию методов для вычисления и отображения результатов.
 */
public class Calc {

  private static final String FNAME = "Item2d.bin";

  private Item2d result;

  private GetMobileOperator getMobileOperator;
  public Calc() {
    result = new Item2d();
    getMobileOperator = new GetMobileOperator();
  }

  public void setResult(Item2d result) {
    this.result = result;
  }

  public Item2d getResult() {
    return result;
  }

  public String init(String phoneNumber) {
    result = getMobileOperator.GetMobileOperatorByPhoneNumber(phoneNumber);
    return result.getMobileOperator();
  }

  public void show() {
    System.out.println(result);
  }

  public String GenerateRandomPhoneNumber() {
    Random random = new Random();

    int prefix;
    switch (random.nextInt(15)) {
    case 0:
      prefix = 50;
      break;
    case 1:
      prefix = 66;
      break;
    case 2:
      prefix = 95;
      break;
    case 3:
      prefix = 99;
      break;
    case 4:
      prefix = 67;
      break;
    case 5:
      prefix = 68;
      break;
    case 6:
      prefix = 96;
      break;
    case 7:
      prefix = 97;
      break;
    case 8:
      prefix = 98;
      break;
    case 9:
      prefix = 63;
      break;
    case 10:
      prefix = 73;
      break;
    case 11:
      prefix = 93;
      break;
    case 12:
      prefix = 91;
      break;
    case 13:
      prefix = 92;
      break;
    default:
      prefix = 94;
      break;
    }

    String phoneNumber = "+380" + prefix + String.format("%07d", random.nextInt(10000000));

    return phoneNumber;

  }
  public void save() throws IOException {
    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
    os.writeObject(result);
    os.flush();
    os.close();
  }

  public void restore() throws Exception {
    ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
    result = (Item2d) is.readObject();
    is.close();
  }
}