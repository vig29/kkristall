package lokaverk;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Kronos on 1.4.2017.
 */
class HotelTest {
    @org.junit.jupiter.api.Test
    void getHotelName() {
        assertEquals("Jon", "Jon");
    }
    //Athugum hvort SearchEngine finnur hótel á áhveðnum stað
    @org.junit.jupiter.api.Test
    void getHotelByLocation() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.searchByLocation("Reykjavík");
        assertEquals(true, (hotels.size() > 0));
    }
    //Athugum hvort SearchEngine skili niðurstöðu á ef umbeðin staður hótels er ekki til.
    @org.junit.jupiter.api.Test
    void getHotelByLocationNotExists() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.searchByLocation("47");
        assertEquals(false, (hotels.size() > 0));
    }

// Athugum hvort SearchEngine finni rétt hótel eftir nafni
    @org.junit.jupiter.api.Test
    void searchByName() {
        String hotelName = "Hotel Granda";
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.searchByName(hotelName);
        boolean sameName = true;
        for(Hotel hotel : hotels)
        {
            if(!hotel.getHotelName().equals(hotelName)){
                sameName=false;
                break;
            }

        }
        assertEquals(true, sameName);
    }

    // Athugum hvort SearchEngine finni ranglega hótel eftir nafni
    @org.junit.jupiter.api.Test
    void searchByNameNotExists() {
        String hotelName = "Cabin of Hanz";
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.searchByName(hotelName);
        boolean sameName = true;
        for(Hotel hotel : hotels)
        {
            if(!hotel.getHotelName().equals(hotelName)){
                sameName=false;
                break;
            }

        }
        assertEquals(true, sameName);
    }
    // Athugum hvort SearchEngine finni hótel með wifi
    @org.junit.jupiter.api.Test
    void searchByWifi() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.hasWifi();
        boolean hasWifi = true;
        for(Hotel hotel : hotels)
        {
            if(!hotel.getWifi()){
                hasWifi=false;
                break;
            }

        }
        assertEquals(true, hasWifi);
    }

    // Athugum hvort SearchEngine finni hótel með morgunverði
    @org.junit.jupiter.api.Test
    void searchByWithBreakfast() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.isBreakfast(true);
        boolean hasBreakfast = true;
        for(Hotel hotel : hotels)
        {
            if(!hotel.getBreakfast()){
                hasBreakfast=false;
                break;
            }

        }
        assertEquals(true, hasBreakfast);
    }
    // Athugum hvort SearchEngine finni hótel án morgunverði
    @org.junit.jupiter.api.Test
    void searchByWithoutBreakfast() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.isBreakfast(false);
        boolean noBreakfast = true;
        for(Hotel hotel : hotels)
        {
            if(hotel.getBreakfast()){
                noBreakfast=false;
                break;
            }

        }
        assertEquals(true, noBreakfast);
    }
    // Athugum hvort SearchEngine finni hótel með morgunverði og ekki með morgunverði
    @org.junit.jupiter.api.Test
    void searchByWithAndWithoutBreakfast() {
        SearchEngine search = new SearchEngine();
        search.isBreakfast(false);
        ArrayList<Hotel> hotels = search.isBreakfast(true);
        assertEquals(0, hotels.size());
    }
    // Gerum próf á verði þar sem 3 eignir uppfylla verðið
    @org.junit.jupiter.api.Test
    void searchByPriceRangeHigherThanMaximum() {
        SearchEngine search = new SearchEngine();
        int minPrice=100001;
        int maxPrice=250000;
        ArrayList<Hotel> hotels = search.searchByPriceRange(minPrice, maxPrice);


        assertEquals(0, hotels.size());
    }


// Gerum próf á verði þar sem enginn eign uppfyllir uppgefið verð.
@org.junit.jupiter.api.Test
void searchByPriceRangeLowerThanMinimum() {
    SearchEngine search = new SearchEngine();
    int minPrice=0;
    int maxPrice=14599;
    ArrayList<Hotel> hotels = search.searchByPriceRange(minPrice, maxPrice);


    assertEquals(0, hotels.size());
}
 // Gerum próf á ákveðnu verðbili, fyrst þegar bilið inni heldur 3 hótel
 @org.junit.jupiter.api.Test
 void searchByPriceRangeHotelMaxPrice() {
     SearchEngine search = new SearchEngine();
     int minPrice=0;
     int maxPrice=500000;
     ArrayList<Hotel> hotels = search.searchByPriceRange(minPrice, maxPrice);


     assertEquals(4, hotels.size());
 }


    // Check if hotel available from the date of a Hotel with oldest available date
    @org.junit.jupiter.api.Test
    void searchHotelAvailableFromDate() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.getHotelsAvailableFrom("01-07-2017");
        assertEquals(1, hotels.size());
    }


    // Check if hotel available from date far far far in the past
    @org.junit.jupiter.api.Test
    void searchHotelAvailableFromDateAgesAgo() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.getHotelsAvailableFrom("01-07-1967");
        assertEquals(0, hotels.size());
    }

    // Try to get all hotels
    @org.junit.jupiter.api.Test
    void searchHotelAvailableGetAll() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.getHotelsAvailableFrom("21-12-2017");
        assertEquals(4, hotels.size());
    }

    @org.junit.jupiter.api.Test
    void searchByNumberOfGuests() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.searchByNumGuests(2);
        assertEquals(2, hotels.size());
    }

    @org.junit.jupiter.api.Test
    void searchByNumberOfGuestsNotExists() {
        SearchEngine search = new SearchEngine();
        ArrayList<Hotel> hotels = search.searchByNumGuests(666);
        assertEquals(0, hotels.size());
    }
}
