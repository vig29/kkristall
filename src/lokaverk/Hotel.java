package lokaverk;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Hotel {
//jjjjj
	private int price;
	private String availableFrom;
	private String hotelName;
	private String hotelLoc;
	private int numPersons;
	private boolean wifiAvailable;
	private boolean isBreakfast;
	private int numRooms;
	private int hotelId;
	
	
	public Hotel(int price, String availableFrom, String hotelName, String hotelLoc, int numPersons, boolean wifiAvailable, boolean isBreakfast, int numRooms, int hotelId) {
		this.setPrice(price);
		this.setAvailableFrom(availableFrom);
		this.setHotelName(hotelName);
		this.setHotelLoc(hotelLoc);
		this.setNumPersons(numPersons);
		this.setWifi(wifiAvailable);
		this.setBreakfast(isBreakfast);
		this.setNumRooms(numRooms);
		this.setHotelId(hotelId);
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setAvailableFrom(String availableFrom) {
		this.availableFrom = availableFrom;
	}
	public String getAvailableFrom() {
		return availableFrom;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelLoc(String hotelLoc) {
		this.hotelLoc = hotelLoc;
	}
	public String getHotelLoc() {
		return hotelLoc;
	}
	
	public void setNumPersons(int numPersons) {
		this.numPersons = numPersons;
	}
	public int getNumPersons() {
		return numPersons;
	}

	public void setWifi(boolean wifiAvailable) {
		this.wifiAvailable = wifiAvailable;
	}
	public boolean getWifi() {
		return wifiAvailable;
	}
	
	public void setBreakfast(boolean isBreakfast) {
		this.isBreakfast = isBreakfast;
	}
	public boolean getBreakfast() {
		return isBreakfast;
	}
	
	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}
	public int getNumRooms() {
		return numRooms;
	}


	public void setHotelId(int hotelId) { this.hotelId = hotelId; }
	public int getHotelId() { return hotelId; }

	public void setBookedDates() { }
	public void isAvailable(String date) { }


}
	
