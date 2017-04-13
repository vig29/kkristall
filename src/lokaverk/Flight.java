package lokaverk;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Flight {

  private int price;
  private String depDate;
  private String depTime;
  private String arrTime;
  private String flightFrom;
  private String flightTo;
  private boolean sagaClass;
  private boolean foodOnBoard;


  public Flight(int price, String depDate, String depTime String arrDate, String flightFrom, String flightTo, boolean sagaClass, boolean foodOnBoard) {
    this.
  }

  public void setPrice(int price) {
    this.price = price;
  }
  public int getPrice() {
    return price;
  }

  public void setDepDate(String depDate) {
    this.depDate = depDate;
  }

  public String getDepDate() {
    return depDate;
  }

  public void setDepTime(String depTime) {
    this.depTime = depTime;
  }

  public String getDepTime() {
    return depTime;
  }

  public void setArrDate(String arrDate) {
    this.arrDate = arrDate;
  }

  public String getArrDate() {
    return arrDate;
  }

  public void setFlightFrom(String flightFrom) {
    this.flightFrom = flightFrom;
  }
  public String getFlightFrom() {
    return flightFrom;
  }

  public void setFlightTo(String flightTo) {
    this.flightTo = flightTo;
  }

  public String getFlightTo() {
    return flightTo;
  }

  public void setSagaClass(boolean sagaClass) {
    this.sagaClass = sagaClass;
  }

  public boolean getSagaClass() {
    return sagaClass;
  }

  public void setFoodOnBoard(boolean foodOnBoard) {
    this.foodOnBoard = foodOnBoard;
  }
  public boolean getFoodOnBoard() {
    return foodOnBoard;
  }
}
