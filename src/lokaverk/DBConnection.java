package lokaverk;

import java.sql.*;

/**
 * Created by Kronos on 14.4.2017.
 */
public class DBConnection {

    private Connection connection;

    public DBConnection() {
        try {

            this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/throun?user=root&password=");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public long bookPackage(long userID, long hotelBookingId, long flightArrivalId, long flightDepartureId)
    {
        try {
            String query = "insert into packages(user_id, hotel_booking_id, flight_arrival_id, flight_departure_id) values (?, ?, ?, ?);";
            PreparedStatement st = this.connection.prepareStatement(query);
            st.setLong(1, userID);
            st.setLong(2, hotelBookingId);
            st.setLong(3, flightArrivalId);
            st.setLong(4, flightDepartureId);
            st.execute();
            try (ResultSet generatedKeys = st.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getLong(1);
                }
                else {
                    throw new SQLException("Inserting package for user failed.");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void insertDayTrip(long packageID)
    {
        try {
            String query = "insert into daytrips(package_id) values (?);";
            PreparedStatement st = this.connection.prepareStatement(query);
            st.setLong(1, packageID);
            st.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public long addUser(String name, String email)
    {
        try {
            String query = "insert into users(name, email) values (?, ?);";
            PreparedStatement st = this.connection.prepareStatement(query);
            st.setString(1, name);
            st.setString(2, email);
            st.execute();

            try (ResultSet generatedKeys = st.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getLong(1);
                }
                else {
                    throw new SQLException("Inserting user failed.");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public boolean existsUser(String email)
    {
        try {
            String query = "select count(*) from users where email = ?;";
            PreparedStatement st = this.connection.prepareStatement(query);
            st.setString(1, email);
            st.execute();

            try (ResultSet generatedKeys = st.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    System.out.println(generatedKeys.getLong(1));
                    return generatedKeys.getLong(1) > 0;
                }
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
