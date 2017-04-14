package lokaverk;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Flight {

  private int price;
  private String depDate;
  private String depTime;
  private String arrDate;
  private String arrTime;
  private String flightFrom;
  private String flightTo;
  private boolean sagaClass;
  private boolean foodOnBoard;
  private int seatsAvailable;



  public Flight(int price, String depDate, String depTime, String arrTime, String flightFrom, String flightTo, boolean sagaClass, boolean foodOnBoard, int seatsAvailable) {
    this.setPrice(price);
    this.setDepDate(depDate);
    this.setDepTime(depTime);
    this.setArrTime(arrTime);
    this.setFlightFrom(flightFrom);
    this.setFlightTo(flightTo);
    this.setSagaClass(sagaClass);
    this.setFoodOnBoard(foodOnBoard);
    this.setSeatsAvailable(seatsAvailable);
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

  public void setArrTime(String arrTime) {
    this.arrDate = arrDate;
  }

  public String getArrTime() {
    return arrTime;
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
  public void setSeatsAvailable(int seatsAvailable) {
    this.seatsAvailable = seatsAvailable;
  }
  public int getSeatsAvailable() {
    return seatsAvailable;
  }
}