class Vehicle {
    String registrationNo;
    Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
    }double calculateFee(int hours) {
        return hours * 30;
    }
}class EBike extends Vehicle {
    EBike(String registrationNo) {
        super(registrationNo);
    }
    @Override
    double calculateFee(int hours) {
        return 20;
    }
}class Car extends Vehicle {
    Car(String registrationNo) {
        super(registrationNo);
    }
    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }
}class DeliveryVan extends Vehicle {
    DeliveryVan(String registrationNo) {
        super(registrationNo);
    }double calculateFee(int hours, int entryHour) {
        double fee = hours * 30;
        if (entryHour >= 9 && entryHour < 17) {
            fee = fee * 2;
        }
        return fee;
    }
}class VisitorPass {
    String visitorName;
    boolean valid;
    VisitorPass(String visitorName) {
        this.visitorName = visitorName;
        this.valid = true;
    }void display() {
        System.out.println("Visitor: " + visitorName);
        System.out.println("One-Day Pass Valid: " + valid);
    }
}class ParkingFacility {
    String[][] slots = new String[5][];
    ParkingFacility() {
        slots[0] = new String[2];
        slots[1] = new String[3];
        slots[2] = new String[4];
        slots[3] = new String[2];
        slots[4] = new String[3];
    }int[] allocate(String vehicleNo) {
        for (int f = 0; f < slots.length; f++) {
            for (int s = 0; s < slots[f].length; s++) {
                if (slots[f][s] == null) {
                    slots[f][s] = vehicleNo;
                    return new int[]{f, s};
                }
            }
        }return null;
    }
}public class Main {
    public static void main(String[] args) {
        System.out.println("CAMPUS SMART PARKING SYSTEM");
        System.out.println("---------------------------");
        EBike bike = new EBike("TN01EB1111");
        Car car = new Car("TN02CA2222");
        DeliveryVan van = new DeliveryVan("TN03DV3333");
        System.out.println("E-Bike Fee: Rs " + bike.calculateFee(5));
        System.out.println("Car Fee: Rs " + car.calculateFee(3));
        System.out.println("Delivery Van Fee (10 AM): Rs "
                + van.calculateFee(2, 10));
        System.out.println("Delivery Van Fee (6 PM): Rs "
                + van.calculateFee(2, 18));
        VisitorPass pass = new VisitorPass("Campus Visitor");
        pass.display();
        ParkingFacility parking = new ParkingFacility();
        System.out.println("\nParking Allocation:");
        int[] slot1 = parking.allocate("TN01EB1111");
        int[] slot2 = parking.allocate("TN02CA2222");
        int[] slot3 = parking.allocate("TN03DV3333");
        System.out.println("E-Bike Slot: Floor " + slot1[0]
                + ", Slot " + slot1[1]);
        System.out.println("Car Slot: Floor " + slot2[0]
                + ", Slot " + slot2[1]);
        System.out.println("Van Slot: Floor " + slot3[0]
                + ", Slot " + slot3[1]);
        System.out.println("\nTotal Floors: " + parking.slots.length);
    }
}
