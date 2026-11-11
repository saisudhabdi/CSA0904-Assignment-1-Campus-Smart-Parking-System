abstract class Vehicle {
    String registrationNo;
    Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
    }
    abstract double calculateFee();
    void display() {
        System.out.println("Registration: " + registrationNo);
    }
}
interface Chargeable {
    void chargeBattery();
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
class ElectricCar extends Vehicle implements Chargeable {
    ElectricCar(String registrationNo) {
        super(registrationNo);
    }
    @Override
    double calculateFee() {
        return 120.0;
    }
    @Override
    public void chargeBattery() {
        System.out.println("Electric vehicle charging started");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("TN01AB1111");
        Vehicle electricCar = new ElectricCar("TN02CD2222");
        car.display();
        System.out.println("Parking Fee: Rs " +
                car.calculateFee());
        electricCar.display();
        System.out.println("Parking Fee: Rs " +
                electricCar.calculateFee());
        Chargeable charger = (Chargeable) electricCar;
        charger.chargeBattery();
    }
}
