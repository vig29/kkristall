package trunk.src.lokaverk;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import lokaverk.DBRmock;
import lokaverk.Trips;

public class SearchEngineDayTrips {

    private ArrayList<Trips> tripList;
    private ArrayList<Trips> filterTripList;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd-mm-yyyy");
    private DBRmock mockdraft;
    public SearchEngine() {
        mockdraft = new DBRmock();
        getList();

    }
    public ArrayList<Trips> getDayTripList() {
        try {
            tripList = mockdraft.retrieveTripList();
        } catch (Exception e) {
            System.err.println("Err: " + e.getMessage());
        }
        return tripList;
    }
    public ArrayList<Trips> searchByLocation(String location) {
        filterTripList = new ArrayList<Trips>();
        for (Trips trips : tripList) {
            if(trips.getLocation().equals(location)) {
                filterTripList.add(trips);
            }
        }
        tripList = filterTripList;
        return tripList;
    }
    public ArrayList<Trips> searchByName(String tripName) {
        filterTripList = new ArrayList<Trips>();
        for (Trips trips : tripList) {
            if(trips.getCompName().equals(tripName)) {
                filterTripList.add(trips);
            }
        }
        tripList = filterTripList;
        return tripList;
    }
    public ArrayList<Trips> searchByPriceRange(int minPrice, int maxPrice){
        filterTripList = new ArrayList<Trips>();
        for(Trips trips : tripList){
            if( trips.getPrice() <= maxPrice && trips.getPrice() >= minPrice)
                filterTripList.add(trips);
        }
        tripList = filterTripList;
        return tripList;
    }

    public ArrayList<Trips> searchByDate(String arrDate, String depDate) {
        filterTripList = new ArrayList<Trips>();
        Date checkArrDate = formatDate.parse(arrDate);
        Date checkDepDate = formatDate.parse(depDate);
        Date tripDate;
        for (Trips trips : tripList) {
            tripDate = formatDate.parse(trips.getDate());
            if(tripDate.before(checkDepDate) && tripDate.after(checkArrDate)) {
                filterTripList.add(trips);
            }
        }
        tripList = filterTripList;
        return tripList;
    }
    public ArrayList<Trips> searchByType(String tripType) {
        filterTripList = new ArrayList<Trips>();
        for (Trips trips : tripList) {
            if(trips.getType().equals(tripType)) {
                filterTripList.add(trips);
            }
        }
        tripList = filterTripList;
        return tripList;
    }



}
