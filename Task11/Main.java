class Vehicle {
    String registrationNo;
    String vehicleType;
    Vehicle(String registrationNo, String vehicleType) {
        this.registrationNo = registrationNo;
        this.vehicleType = vehicleType;
    }double calculateFee() {
        return 50.0;
    }
}class Car extends Vehicle {
    Car(String registrationNo) {
        super(registrationNo, "Car");
    }@Override
    double calculateFee() {
        return 90.0;
    }
}class TwoWheeler extends Vehicle {
    TwoWheeler(String registrationNo) {
        super(registrationNo, "TwoWheeler");
    }@Override
    double calculateFee() {
        return 30.0;
    }
}class ParkingTicket {
    static int counter = 1000;
    int ticketNo;
    Vehicle vehicle;
    ParkingTicket(Vehicle vehicle) {
        this.vehicle = vehicle;
        ticketNo = ++counter;
    }void display() {
        System.out.println("Ticket: " + ticketNo);
        System.out.println("Vehicle: " + vehicle.registrationNo);
        System.out.println("Type: " + vehicle.vehicleType);
        System.out.println("Fee: Rs " + vehicle.calculateFee());
    }
}class ParkingFacility {
    String[][] slots;
    ParkingFacility(int[] capacity) {
        slots = new String[capacity.length][];
        for (int i = 0; i < capacity.length; i++) {
            slots[i] = new String[capacity[i]];
        }
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
    boolean release(int floor, int slot) {
        if (floor < 0 || floor >= slots.length)
            return false;
        if (slot < 0 || slot >= slots[floor].length)
            return false;
        if (slots[floor][slot] == null)
            return false;
        slots[floor][slot] = null;
        return true;
    }
}public class Main {
    public static void main(String[] args) {
        ParkingFacility parking =
                new ParkingFacility(new int[]{2, 1});
        Vehicle v1 = new Car("TN01AB1111");
        Vehicle v2 = new TwoWheeler("TN02CD2222");
        int[] slot1 = parking.allocate(v1.registrationNo);
        int[] slot2 = parking.allocate(v2.registrationNo);
        System.out.println("Campus Smart Parking System");
        System.out.println("----------------------------");
        System.out.println("Car allocated: " +
                java.util.Arrays.toString(slot1));
        System.out.println("TwoWheeler allocated: " +
                java.util.Arrays.toString(slot2));
        ParkingTicket t1 = new ParkingTicket(v1);
        ParkingTicket t2 = new ParkingTicket(v2);
        System.out.println("\nTicket Details:");
        t1.display();
        t2.display();
        System.out.println("\nSlot Release: " +
                parking.release(0, 0));
        System.out.println("Total Tickets: " +
                ParkingTicket.counter);
    }
}
