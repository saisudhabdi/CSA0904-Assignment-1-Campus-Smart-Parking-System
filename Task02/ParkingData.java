import java.util.Scanner;

public class ParkingData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] slots = new String[3][];

        slots[0] = new String[20];
        slots[1] = new String[50];
        slots[2] = new String[100];

        System.out.println("CAMPUS SMART PARKING SYSTEM");

        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.nextLine();

        System.out.print("Enter Floor Number (0-2): ");
        int floor = sc.nextInt();

        System.out.print("Enter Slot Number: ");
        int slot = sc.nextInt();

        if (floor >= 0 && floor < slots.length &&
            slot >= 0 && slot < slots[floor].length &&
            slots[floor][slot] == null) {

            slots[floor][slot] = vehicleNo;

            System.out.println("\nVehicle Parked Successfully!");
            System.out.println("Vehicle Number: " + vehicleNo);
            System.out.println("Floor: " + floor);
            System.out.println("Slot: " + slot);

        } else {
            System.out.println("Invalid or Occupied Slot!");
        }

        int minutes = 90;
        double ratePerHour = 30.0;

        double hours = Math.ceil(minutes / 60.0);
        double fee = hours * ratePerHour;

        System.out.println("\nParking Fee Calculation");
        System.out.println("Duration: " + minutes + " minutes");
        System.out.println("Billable Hours: " + hours);
        System.out.println("Total Fee: Rs. " + fee);

        sc.close();
    }
}
