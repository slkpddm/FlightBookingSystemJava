import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightBookingSystem {
    public static void main(String[] args) {
        // Create a sample flight
        Flight flight = new Flight("Airline1", "CityA", "CityB", new Date(), new Date(), 100.0, 200);

        // Create a sample user
        User user = new User("John Doe", "john@email.com", "password123", "1234567890");

        // Create sample passengers
        Passenger passenger1 = new Passenger("Passenger1", 25, "Male", "9876543210");
        Passenger passenger2 = new Passenger("Passenger2", 30, "Female", "9876543211");

        List<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);

        // Book flight for passengers
        Booking booking = user.bookFlight(flight, passengers);

        // Display booking details
        System.out.println("Flight Details: " + flight.toString());
        System.out.println("User Details: " + user.toString());
        System.out.println("Booking Details: " + booking.toString());
        System.out.println("Status: " + booking.getStatus());
    }
}
