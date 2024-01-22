import java.util.Date;
import java.util.UUID;

public class Flight {
    private String flightID;
    private String airline;
    private String source;
    private String destination;
    private Date departureTime;
    private Date arrivalTime;
    private double price;
    private int availableSeats;

    public Flight(String airline, String source, String destination, Date departureTime, Date arrivalTime, double price, int availableSeats) {
        this.flightID = UUID.randomUUID().toString();
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public String getFlightID() {
        return flightID;
    }

    public int checkAvailability() {
        return availableSeats;
    }

    public void updateAvailability(int seatsBooked) {
        this.availableSeats -= seatsBooked;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightID='" + flightID + '\'' +
                ", airline='" + airline + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", price=" + price +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
