class Vehicle {
    private String registrationNo;
    private String vehicleType;
    private double parkingFee;
    public void setRegistrationNo(String registrationNo) {
        if (registrationNo == null || registrationNo.isEmpty()) {
            System.out.println("Invalid registration number");
        } else {
            this.registrationNo = registrationNo;
        }
    }
    public void setVehicleType(String vehicleType) {
        if (vehicleType == null || vehicleType.isEmpty()) {
            System.out.println("Invalid vehicle type");
        } else {
            this.vehicleType = vehicleType;
        }
    }
    public void setParkingFee(double parkingFee) {
        if (parkingFee < 0) {
            System.out.println("Invalid parking fee");
        } else {
            this.parkingFee = parkingFee;
        }
    }
    public String getRegistrationNo() {
        return registrationNo;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public double getParkingFee() {
        return parkingFee;
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setRegistrationNo("TN01AB1111");
        v.setVehicleType("Car");
        v.setParkingFee(90.0);
        System.out.println("Registration: " + v.getRegistrationNo());
        System.out.println("Vehicle Type: " + v.getVehicleType());
        System.out.println("Parking Fee: Rs " + v.getParkingFee());
        Integer ticketNumber = 1001;
        Double fee = v.getParkingFee();
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Wrapper Fee: " + fee);
    }
}
