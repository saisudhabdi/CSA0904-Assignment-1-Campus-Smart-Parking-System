class ParkingTicket {
    static int ticketCounter = 1000;
    int ticketNumber;
    String vehicleNo;
    ParkingTicket(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        ticketNumber = ++ticketCounter;
    }
    void display() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Vehicle Number: " + vehicleNo);
    }
}
class ParkingService {
    void printTicket(ParkingTicket ticket) {
        ticket.display();
    }
}
public class Main {
    public static void main(String[] args) {
        ParkingTicket t1 = new ParkingTicket("TN01AB1111");
        ParkingTicket t2 = new ParkingTicket("TN02CD2222");
        ParkingTicket t3 = new ParkingTicket("TN03EF3333");
        ParkingService service = new ParkingService();
        System.out.println("Parking Ticket Details:");
        service.printTicket(t1);
        service.printTicket(t2);
        service.printTicket(t3);
        System.out.println("Total Tickets: " +
                ParkingTicket.ticketCounter);
    }
}
