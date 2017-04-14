package lokaverk;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import lokaverk.DBRmock;
import lokaverk.Hotel;

public class SearchEngine {

    private ArrayList<Hotel> hotelList;
    private ArrayList<Hotel> filterHotelList;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd-mm-yyyy");
    private DBRmock mockdraft;
    
    public SearchEngine() {
    	mockdraft = new DBRmock();
		getHotelList();
 
    }
    public ArrayList<Hotel> getHotelList() {
    	try {
    		hotelList = mockdraft.retrieveHotelList();
    	} catch (Exception e) {
    		System.err.println("Err: " + e.getMessage());
    	}
    	return hotelList;
    }

    
    public ArrayList<Hotel> searchByLocation(String location) {
    	filterHotelList = new ArrayList<Hotel>();
    	for (Hotel hotel : hotelList) {
    		if(hotel.getHotelLoc().equals(location)) {
    			filterHotelList.add(hotel);
    		}
    	}
    	hotelList = filterHotelList;
    	return hotelList;
    }

	public ArrayList<Hotel> searchByName(String hotelName) {
    	filterHotelList = new ArrayList<Hotel>();
    	for (Hotel hotel : hotelList) {
    		if(hotel.getHotelName().equals(hotelName)) {
    			filterHotelList.add(hotel);
    		}
    	}
    	hotelList = filterHotelList;
    	return hotelList;
    }
    //Nýtt
	 public ArrayList<Hotel> hasWifi(){
    	filterHotelList = new ArrayList<Hotel>();
    	for(Hotel hotel : hotelList){
    		if(hotel.getWifi())
    			filterHotelList.add(hotel);
		}
		 hotelList = filterHotelList;
		 return hotelList;
	 }
    //Nýtt
	 public ArrayList<Hotel> isBreakfast(boolean breakfast){
    	filterHotelList = new ArrayList<Hotel>();
    	for(Hotel hotel : hotelList){
    		if(hotel.getBreakfast() && breakfast)
    			filterHotelList.add(hotel);
    		else if(!hotel.getBreakfast() && !breakfast)
    			filterHotelList.add(hotel);
		}
		 hotelList = filterHotelList;
		 return hotelList;
	 }
	 //Nýtt
	 public ArrayList<Hotel> searchByNumGuests(int numGuests){
		filterHotelList = new ArrayList<Hotel>();
		for(Hotel hotel : hotelList){
			if(hotel.getNumPersons() == numGuests)
				filterHotelList.add(hotel);
		}
		 hotelList = filterHotelList;
		 return hotelList;
	}

	//Nýtt
	public ArrayList<Hotel> searchByPriceRange(int minPrice, int maxPrice){
		filterHotelList = new ArrayList<Hotel>();
		for(Hotel hotel : hotelList){
			if( hotel.getPrice() <= maxPrice && hotel.getPrice() >= minPrice)
				filterHotelList.add(hotel);
		}
		hotelList = filterHotelList;
		return hotelList;
	}

	public  ArrayList<Hotel> getHotelsAvailableFrom(String dateFrom)
	{
		filterHotelList = new ArrayList<Hotel>();
		try {
			Date availableFrom = formatDate.parse(dateFrom);

			Date hotelAvailableDate;
			for(Hotel hotel : hotelList) {
				hotelAvailableDate = formatDate.parse(hotel.getAvailableFrom());

				if(hotelAvailableDate.before(availableFrom) || hotelAvailableDate.equals(availableFrom)) {
					filterHotelList.add(hotel);
				}
			}
			hotelList = filterHotelList;
			return hotelList;

		} catch (ParseException exception) {
			return new ArrayList<Hotel>();
		}


	}
}
    