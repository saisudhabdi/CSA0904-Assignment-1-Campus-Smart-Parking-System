class Vehicle {
    String registrationNo;
    String vehicleType;
    // Parameterised constructor
    Vehicle(String registrationNo, String vehicleType) {
        this.registrationNo = registrationNo;
        this.vehicleType = vehicleType;
    }
    // Copy constructor
    Vehicle(Vehicle other) {
        this.registrationNo = other.registrationNo;
        this.vehicleType = other.vehicleType;
    }
    void display() {
        System.out.println("Registration: " + registrationNo);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating object using parameterised constructor
        Vehicle v1 = new Vehicle("TN01AB1111", "Car");
        // Creating object using copy constructor
        Vehicle v2 = new Vehicle(v1);
        System.out.println("Original Vehicle:");
        v1.display();
        System.out.println("\nCopied Vehicle:");
        v2.display();
    }
}
