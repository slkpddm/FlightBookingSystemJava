import java.util.List;
import java.util.UUID;

public class Booking {
    private String bookingID;
    private String userID;
    private String flightID;
    private List<Passenger> passengers;
    private String status;

    public Booking(String userID, String flightID, List<Passenger> passengers) {
        this.bookingID = UUID.randomUUID().toString();
        this.userID = userID;
        this.flightID = flightID;
        this.passengers = passengers;
        this.status = "Pending";
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getStatus() {
        return status;
    }

    public boolean cancelBooking() {
        if (this.status.equals("Confirmed")) {
            this.status = "Cancelled";
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID='" + bookingID + '\'' +
                ", userID='" + userID + '\'' +
                ", flightID='" + flightID + '\'' +
                ", passengers=" + passengers +
                ", status='" + status + '\'' +
                '}';
    }
}
