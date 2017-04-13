package lokaverk;

import java.util.ArrayList;
import lokaverk.Hotel;

public class DBRmock implements DBRInterface {
	
	private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	
	public ArrayList<Hotel> retrieveList() {
		Hotel RvkGrand = new Hotel( 20000, "01-07-2017", "Hotel Grand", "Reykjavík", 2, true, true, 4);
		hotelList.add(RvkGrand);
		Hotel RvkHilton = new Hotel( 30000, "10-08-2017", "Hilton Hotel", "Reykjavík", 2, false, true, 15);
		hotelList.add(RvkHilton);
		Hotel HofnDyngja = new Hotel(15000,"02-06-2017", "Dyngja Guesthouse", "Höfn", 5, true, false, 12);
		hotelList.add(HofnDyngja);
		Hotel RvkRad = new Hotel(100000, "21-12-2017", "Radison Blu", "Reykjavík", 4, true, false, 15);
		hotelList.add(RvkRad);
		return hotelList;
	}


}

