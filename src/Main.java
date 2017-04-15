import lokaverk.DBConnection;
import lokaverk.SearchFlights;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        SearchFlights searchFlights = new SearchFlights();
        DBConnection con = new DBConnection();
        Scanner sc = new Scanner(System.in);
        Scanner textscan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Choose: 1. for existing user and 2. for new user");
//        int input1 = sc.nextInt();

        if(con.existsUser("atli@gmila.com"))
        {
            System.out.println("exists");
        }
        else
        {
            System.out.println("!exists");
        }
//
//        if(input1==1){
//            String existingNeme:
//            System.out.print("Existing username:");
//            existingNeme =textscan.nextLine();
//
//            //leit í gagnagrunni hvort user er til. ef ekki gefa villu
//
//        }
//        if(input1 ==2){
//            String newName;
//            String newMail;
//            System.out.print("New username: ");
//            newName =textscan.nextLine();
//            System.out.print("Email: ");
//            newMail = textscan.nextLine();
//            long userID = con.addUser(newName, newMail);
//        }
//
//        String locationFrom;
//        String locationTo;
//        String deppDate;
//        String arrDate;
//        System.out.println("Now enter how you want your trip");
//        System.out.print("Traveling from: ");
//        locationFrom =textscan.nextLine();
//        System.out.print("Traveling to: ");
//        locationTo =textscan.nextLine();
//        System.out.print("Departure date: ");
//        deppDate =textscan.nextLine();
//        System.out.print("Arrival date: ");
//        arrDate =textscan.nextLine();

//        SearchFlights.searchByLocation(locationFrom,locationTo);


       // System.out.print("What kind of activities would you like. 1: Sight seeing: ");

       // long userID = con.addUser("Jane", "jane@doe.com");
        //long packageID = con.bookPackage(userID,1,1,1);
      //  con.insertDayTrip(packageID);


    }
}
