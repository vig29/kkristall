package lokaverk;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Trips {

  private int price;
  private String location;
  private String tripType;
  private String aboutTrip;
  private String date;
  private String startTime;
  private String endtime;

  public Trips(int price, String location, String tripType, String aboutTrip, String date, String startTime, String endTime) {

  }

  public void setPrice(int price) {
    this.price = price;
  }
  public int getPrice() {
    return price;
  }

  public void setLocation(String location) {
    this.location = location;
  }
  public String getLocation() {
    return location;
  }

  public void setTripType(String tripType) {
    this.tripType = tripType;
  }
  public String getTripType() {
    return tripType;
  }
  
