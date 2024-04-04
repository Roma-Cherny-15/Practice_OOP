package ex01;
import java.io.Serializable;
/** Хранит исходные данные и результат вычислений.*/
public class Item2d implements Serializable {

  // transient
  private String phoneNumber;

  private String mobileOperator;

  private static final long serialVersionUID = 1L;

  public Item2d() {
    phoneNumber = "undefined";
    mobileOperator = "undefined";
  }

  public Item2d(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Item2d setVariables(String phoneNumber, String mobileOperator) {
    this.phoneNumber = phoneNumber;
    this.mobileOperator = mobileOperator;
    return this;

  }

  public String setPhoneNumber(String phoneNumber) {
    return this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public String setMobileOperator(String mobileOperator) {
    return this.mobileOperator = mobileOperator;
  }
  public String getMobileOperator() {
    return this.mobileOperator;
  }
  @Override
  public String toString() {
    return "PhoneNumber: " + phoneNumber + ", mobile operator: " + mobileOperator;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;

    Item2d other = (Item2d) obj;
    if (phoneNumber == null) {
      if (other.phoneNumber != null)
        return false;
    } else if (!phoneNumber.equals(other.phoneNumber))
      return false;

    if (mobileOperator == null) {
      if (other.mobileOperator != null)
        return false;
    } else if (!mobileOperator.equals(other.mobileOperator))
      return false;
    return true;
  }
}