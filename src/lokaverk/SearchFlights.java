package lokaverk;

        import java.text.ParseException;
        import java.util.ArrayList;
        import java.util.Date;
        import java.text.SimpleDateFormat;
        import lokaverk.DBRmock;
        import lokaverk.Flight;

public class SearchFlights {
    private ArrayList<Flight> flightList;
    private ArrayList<Flight> filterFlightList;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd-mm-yyyy");
    private DBRmock mockdraft;

    public SearchFlights() {
        mockdraft = new DBRmock();
        getList();
    }
    public ArrayList<Flight> getList() {
        try {
            flightList = mockdraft.retrieveFlightList();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return flightList;
    }

    public ArrayList<Flight> searchByLocation(String flightFrom, String flightTo) {
        filterFlightList = new ArrayList<Flight>();
        for (Flight flight : flightList) {
            if(flight.getFlightFrom().equals(flightFrom) && flight.getFligtTo().equals(flightTo)) {
                filterFlightList.add(flight);
            }
        }
        flightList = filterFlightList;
        return flightList
    }

    public ArrayList<Flight> searchByFlightDate(String dateTo) {
        filterFlightList = new ArrayList<Flight>();
        try {
            Date departureDate = formatDate.parse(dateTo);
            Date depDateAvailable;
            for (Flight flight : flightList) {
                depDateAvailable = formatDate.parse(flight.getDepDate());

                if (depDateAvailable.equals(departureDate)); {
                    filterFlightList.add(flight);
                }
            }

            flightList = filterFlightList;
            return flightList;
        } catch (ParseException exception) {
            return new ArrayList<Flight>();
        }

    }
    public ArrayList<Flight> filterByAvailableSeats(int num) {
        filterFlightList = new ArrayList<Flight>();
        for (Flight flight : flightList) {
            if (flight.getSeatsAvailable() >= num) {
                filterFlightList.add(flight);
            }
        }
        flightList = filterFlightList;
        return flightList;
    }

    public ArrayList<Flight> getOnlySagaClass() {
        filterFlightList = new ArrayList<Flight>();
        for (Flight flight : flightList) {
            if (flight.getSagaClass())
                filterFlightist.add(flight);
        }
        flightList = filterFlightList;
        return flightList;
    }
    public ArrayList<Flight> getOnlyFoodOnBoard() {
        filterFlightList = new ArrayList<Flight>();
        for (Flight flight : flightList) {
            if (flight.getFoodOnBoard())
                filterFlightList.add(flight);
        }
        flightList = filterFlightList;
        return flightList;
    }

}
