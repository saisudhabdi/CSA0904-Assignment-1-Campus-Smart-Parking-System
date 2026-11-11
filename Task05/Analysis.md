 TASK 05 – Static Members, Object Lifecycle and Object Passing
1. Objective
To understand static variables, object lifecycle and object passing in Java using the Campus Smart-Parking System.
 2. Static Members
A static variable belongs to the class rather than an individual object. It is shared by all objects of that class.
Example:
```java
class ParkingTicket {
    static int ticketCounter = 1000;

    int ticketNumber;

    ParkingTicket() {
        ticketNumber = ++ticketCounter;
    }
}
```
Each new ticket receives a unique ticket number.
 3. Object Lifecycle
The object lifecycle includes:
1. Object creation using the `new` keyword.
2. Object initialisation through constructors.
3. Object usage through methods.
4. Object becoming unreachable when no references remain.
5. Garbage collection reclaiming its memory.
 
 4. Object Passing
Java passes arguments by value. When an object is passed to a method, the value of its reference is copied.
Example:
```java
class Vehicle {
    String registrationNo;

    Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
    }
}

class ParkingService {
    void displayVehicle(Vehicle v) {
        System.out.println(v.registrationNo);
    }
}
```
The method receives a copy of the reference and can access the same object.
 5. Static vs Instance Variables
| Static Variable | Instance Variable |
|---|---|
| Belongs to the class | Belongs to each object |
| Shared by all objects | Separate for each object |
| Uses the `static` keyword | No `static` keyword |
| Suitable for common counters | Suitable for individual vehicle details |
 6. Multiple Parking Facilities
If the ticket counter is static, all parking facilities share one ticket sequence. If it is an instance variable, each facility maintains a separate sequence.

A static counter is selected because ticket numbers should remain unique across the entire campus parking system.

## 7. Conclusion

Static members provide shared data across objects. Object lifecycle concepts explain creation and memory management, while object passing allows methods to work with existing objects. These concepts improve the organisation and reliability of the parking system.
