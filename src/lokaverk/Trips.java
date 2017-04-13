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
  private String endTime;

  public Trips(int price, String location, String compName, String aboutTrip, String date, String startTime, String duration) {
    this.setPrice(price);
    this.setLocation(location);
    this.setCompName(compName);
    this.setAboutTrip(aboutTrip);
    this.setDate(date);
    this.setStartTime(startTime);
    this.setDuration(duration);
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

  public void setCompName(String compName) {
    this.compName = compName;
  }
  public String getCompName() {
    return compName;
  }

  public void setAboutTrip(String aboutTrip) {
    this.aboutTrip = aboutTrip;
  }
  public String getAboutTrip() {
    return aboutTrip;
  }

  public void setDate(String date) {
    this.date = date;
  }
  public String getDate() {
    return date;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }
  public String getStartTime() {
    return startTime;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }
  public String getDuration() {
    return duration;
  }
}