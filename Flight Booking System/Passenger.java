import java.util.UUID;

public class Passenger {
    private String passengerID;
    private String name;
    private int age;
    private String gender;
    private String contactNumber;

    public Passenger(String name, int age, String gender, String contactNumber) {
        this.passengerID = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerID='" + passengerID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
