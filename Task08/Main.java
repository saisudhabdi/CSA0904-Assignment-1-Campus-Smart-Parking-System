class Vehicle {
    String registrationNo;
    Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
    }
    // Method overloading
    double calculateFee(int hours) {
        return hours * 30.0;
    }
    double calculateFee(int hours, double rate) {
        return hours * rate;
    }
    // Method to be overridden
    double getParkingFee() {
        return 50.0;
    }
    boolean equalsVehicle(Vehicle other) {
        return registrationNo.equals(other.registrationNo);
    }
}
class TwoWheeler extends Vehicle {
    TwoWheeler(String registrationNo) {
        super(registrationNo);
    }
    @Override
    double getParkingFee() {
        return 30.0;
    }
}
class Car extends Vehicle {
    Car(String registrationNo) {
        super(registrationNo);
    }
    @Override
    double getParkingFee() {
        return 90.0;
    }
}
class ElectricCar extends Vehicle {
    ElectricCar(String registrationNo) {
        super(registrationNo);
    }
    @Override
    double getParkingFee() {
        return 210.0;
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new TwoWheeler("TN01A1");
        Vehicle v2 = new Car("TN02B2");
        Vehicle v3 = new ElectricCar("TN03C3");
        System.out.println("TwoWheeler " + v1.registrationNo +
                " -> Rs " + v1.getParkingFee());
        System.out.println("Car " + v2.registrationNo +
                " -> Rs " + v2.getParkingFee());
        System.out.println("ElectricCar " + v3.registrationNo +
                " -> Rs " + v3.getParkingFee());
        Vehicle v4 = new Car("TN02B2");
        System.out.println(v2.equalsVehicle(v4));
    }
}
