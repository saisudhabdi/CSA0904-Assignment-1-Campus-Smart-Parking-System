import java.util.Objects;
class Vehicle {
    final String registrationNo;
    Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
    }
    double calculateFee() {
        return 50.0;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return registrationNo.equals(other.registrationNo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(registrationNo);
    }
    @Override
    public String toString() {
        return "Vehicle: " + registrationNo;
    }
}
class Car extends Vehicle {
    Car(String registrationNo) {
        super(registrationNo);
    }
    @Override
    double calculateFee() {
        return 90.0;
    }
}
class ElectricCar extends Vehicle {
    ElectricCar(String registrationNo) {
        super(registrationNo);
    }
    @Override
    double calculateFee() {
        return 120.0;
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car("TN01AB1111");
        Vehicle v2 = new ElectricCar("TN02CD2222");
        Vehicle v3 = new Car("TN01AB1111");
        System.out.println(v1);
        System.out.println("Car Fee: Rs " + v1.calculateFee());
        System.out.println(v2);
        System.out.println("Electric Car Fee: Rs " +
                v2.calculateFee());
        System.out.println("Objects Equal: " + v1.equals(v3));
        System.out.println("Hash Codes Equal: " +
                (v1.hashCode() == v3.hashCode()));
    }
}
