import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userID;
    private String name;
    private String email;
    private String password;
    private String phone;
    private List<Booking> bookings;

    public User(String name, String email, String password, String phone) {
        this.userID = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.bookings = new ArrayList<>();
    }

    public Booking bookFlight(Flight flight, List<Passenger> passengers) {
        Booking booking = new Booking(this.userID, flight.getFlightID(), passengers);
        bookings.add(booking);
        flight.updateAvailability(passengers.size());
        return booking;
    }

    public List<Booking> getBookings() {
        return this.bookings;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
