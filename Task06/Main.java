class Vehicle {
    String registrationNo;
    Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
        System.out.println("Vehicle constructor called");
    }
    void display() {
        System.out.println("Registration Number: " + registrationNo);
    }
}
class Car extends Vehicle {
    String model;
    Car(String registrationNo, String model) {
        super(registrationNo);
        this.model = model;
        System.out.println("Car constructor called");
    }
    void display() {
        super.display();
        System.out.println("Car Model: " + model);
    }
}
class TwoWheeler extends Vehicle {
    TwoWheeler(String registrationNo) {
        super(registrationNo);
        System.out.println("TwoWheeler constructor called");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Car:");
        Car c = new Car("TN01AB1111", "Honda City");
        c.display();
        System.out.println("\nCreating TwoWheeler:");
        TwoWheeler t = new TwoWheeler("TN02CD2222");
        t.display();
    }
}
