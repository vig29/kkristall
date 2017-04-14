import lokaverk.DBConnection;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DBConnection con = new DBConnection();

        long userID = con.addUser("Jane", "jane@doe.com");
        long packageID = con.bookPackage(userID,1,1,1);
        con.insertDayTrip(packageID);
    }
}
