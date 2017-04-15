package lokaverk;

import java.util.ArrayList;
import lokaverk.Hotel;
import lokaverk.Flight;
import lokaverk.Trips;

public class DBRmock implements DBRInterface {
	


	private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	private ArrayList<Flight> flightList = new ArrayList<Flight>();
	private ArrayList<Trips> tripList = new ArrayList<Trips>();

	public ArrayList<Hotel> retrieveHotelList() {
		Hotel RvkGrand = new Hotel( 20000, "01-07-2017", "Hotel Grand", "Reykjavík", 2, true, true, 4, 1);
		hotelList.add(RvkGrand);
		Hotel RvkGrand2 = new Hotel( 25000, "05-07-2017", "Hotel Grand", "Reykjavík", 3, true, true, 7, 2);
		hotelList.add(RvkGrand);
		Hotel RvkHilton = new Hotel( 30000, "10-08-2017", "Hilton Hotel", "Reykjavík", 2, false, true, 15, 3);
		hotelList.add(RvkHilton);
		Hotel RvkHilton2 = new Hotel( 45000, "12-07-2017", "Hilton Hotel", "Reykjavík", 3, false, true, 15, 4);
		hotelList.add(RvkHilton);
		Hotel RvkDyngja = new Hotel(15000,"02-06-2017", "Dyngja Guesthouse", "Reykjavik", 5, true, false, 12, 5);
		hotelList.add(RvkDyngja);
		Hotel RvkRad = new Hotel(100000, "21-12-2017", "Radison Blu", "Reykjavík", 4, true, false, 15, 6);
		hotelList.add(RvkRad);
		Hotel RvkFosshotel = new Hotel(12000, "5-05-2017", "Fosshotel", "Reykjavík", 2, false, false, 20, 7);
		hotelList.add(RvkFosshotel);
		Hotel RvkApotek = new Hotel(50000, "5-06-2017", "Apotek", "Reykjavík", 2, true, true, 10, 8);
		hotelList.add(RvkApotek);
		Hotel Rvkcenter = new Hotel(16000, "5-07-2017", "Center", "Reykjavík", 2, false, false, 15, 9);
		hotelList.add(Rvkcenter);
		Hotel RvkReykjavikHostels = new Hotel(5000, "01-05-2017", "Reykjavik Hostel", "Reykjavík", 4, false, false, 50, 10);
		hotelList.add(RvkReykjavikHostels);
		Hotel RvkHolt = new Hotel(18000, "21-06-2017", "Holt", "Reykjavík", 2, true, false, 6, 11 );
		hotelList.add(RvkHolt);
		Hotel RvkSkuggi = new Hotel(7990, "21-06-2017", "Skuggi", "Reykjavík", 3, false, true, 5, 12 );
		hotelList.add(RvkSkuggi);
		Hotel RvkCapsule = new Hotel(4990, "20-05-2017", "Reykjavík Capsule Hotel", "Reykjavík", 1, false, true, 45,13);
		hotelList.add(RvkCapsule);

		Hotel AkBrynja = new Hotel(65000, "20-07-2017", "Hotel Brynja", "Akureyri", 2, true, true, 11,14);
		hotelList.add(AkBrynja);
		Hotel AkHoll = new Hotel(9500, "01-07-2017", "Hóll Hotel", "Akureyri", 2, true, true, 6,15);
		hotelList.add(AkHoll);
		Hotel AkBru = new Hotel(6000, "02-05-2017", "Hotel Brú", "Akureyri", 4, true, false, 10, 16);
		hotelList.add(AkBru);
		Hotel AkSjon = new Hotel(7500, "02-06-2017", "Hotel Sjón", "Akureyri", 2, false, false, 1, 17);
		hotelList.add(AkSjon);
		Hotel AkDyngja = new Hotel(15000, "02-08-2017", "Dyngja Hotel", "Akureyri", 3, false, false, 5, 18);
		hotelList.add(AkDyngja);
		Hotel AkVerkHostel = new Hotel(4000, "15-05-2017", "Verk Hostel", "Akureyri", 2, false, false, 3, 19);
		hotelList.add(AkVerkHostel);
		Hotel AkCapsuleHostel = new Hotel(6500,"21-06-2017", "Capsule Hostel", "Akureyri", 2, true, false, 3, 20);
		hotelList.add(AkCapsuleHostel);
		return hotelList;
	}



	public ArrayList<Flight> retrieveFlightList() {
		Flight Flight1 = new Flight(30000, "01-07-2017", "09:00", "10:10", "Reykjavík", "Akureyri", false, false, 20,1);
		flightList.add(Flight1);
		Flight Flight2 = new Flight(28000, "04-07-2017", "10:30", "11:40", "Akureyri", "Reykjavík", false, false,25,2);
		flightList.add(Flight2);
		Flight Flight3 = new Flight(22000, "10-08-2017", "08:40", "09:30", "Höfn", "Reykjavík", false, false,32,3);
		flightList.add(Flight3);
		Flight Flight4 = new Flight(22000, "13-08-2017", "10:00", "10:50", "Reykjavík", "Höfn", false, false,36,4);
		flightList.add(Flight4);
		Flight Flight5 = new Flight(15000, "02-06-2017", "15:00", "16:40", "Ísafjörður", "Höfn", false, true,52,5);
		flightList.add(Flight5);
		Flight Flight6 = new Flight(15500, "06-06-2017", "17:00", "18:40", "Höfn", "Ísafjörður", false, true,58,6);
		flightList.add(Flight6);
		Flight Flight7 = new Flight(20000, "21-12-2017", "06:40", "08:00", "Egilsstaðir", "Reykjavík", true, true,45,7);
		flightList.add(Flight7);
		Flight Flight8 = new Flight(20000, "28-12-2017", "08:30", "09:50", "Reykjavík", "Egilsstaðir", true, true, 15,8);
		flightList.add(Flight8);
		return flightList;
	}

	public ArrayList<Trips> retrieveTripList() {
		Trips Trip1 = new Trips(20000, "Reykjavík", "Elding", "Bátsferð með Eldingu, Hvalaskoðun", "22-12-2017", "17:00", "02:00", "Sight Seeing" , 1);
		tripList.add(Trip1);
		Trips Trip2 = new Trips(150000, "Akureyri", "Fly With Me", "Þyrluferð yfir stór Reykjavíkursvæðið með guide", "03-07-2017", "21:00", "01:00", "Adventure", 2);
		tripList.add(Trip2);
		Trips Trip3 = new Trips(40000, "Höfn", "Glacier Guides", "Snjósleðaferð uppá hálendi Íslands", "12-08-2017", "11:00", "04:00","Adventure",3);
		tripList.add(Trip3);
		Trips Trip4 = new Trips(7000, "Reykjavík", "Bláa Lónið", "Bað í iðnaðarúrgangi", "01-05-2017", "18:00", "03:00","Health",4);
		tripList.add(Trip4);
		Trips Trip5 = new Trips(4000, "Akureyri", "SegwayAK", "Ferð á segwey um Akureyri", "01-05-2017", "12:00", "02:00","Sigh Seeing",5);
		tripList.add(Trip5);
		Trips Trip6 = new Trips(15000, "Akureyri", "AkSpa", "Nudd og böð", "05-06-2017", "14:00", "04:00","Health",6);
		tripList.add(Trip6);
		Trips Trip7 = new Trips(35000, "Akureyri", "ATV AK", "Fjórhjólaferð", "05-07-2017", "10:00", "06:00","Adventure",7);
		tripList.add(Trip7);
		return tripList;
	}
}

