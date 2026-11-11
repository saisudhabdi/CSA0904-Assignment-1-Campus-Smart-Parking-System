 TASK 11 – Complete Implementation, Testing and Evaluation
 1. Objective
To integrate the object-oriented concepts learned in previous tasks and evaluate the Campus Smart-Parking System through testing.

 2. System Implementation
The Campus Smart-Parking System uses the following classes:
- Vehicle – Stores common vehicle information.
- Car – Represents four-wheeler vehicles.
- TwoWheeler – Represents bikes and scooters.
- ElectricCar – Represents electric vehicles.
- ParkingFacility – Manages parking floors and slots.
- ParkingTicket – Generates unique parking tickets.
- ParkingService – Handles parking operations.

 3. Testing
The system is tested using different scenarios.
| Test Case | Input | Expected Result |
|---|---|---|
| TC01 | Valid vehicle number | Vehicle registered |
| TC02 | Available parking slot | Slot allocated |
| TC03 | Full parking facility | Allocation rejected |
| TC04 | Valid occupied slot | Slot released |
| TC05 | Invalid floor number | Release rejected |
| TC06 | Negative parking fee | Validation error |
| TC07 | Electric vehicle | Charging option available |

 4. Data Structure Comparison
| Data Structure | Advantages | Disadvantages |
|---|---|---|
| Array | Simple and fast access | Fixed size |
| ArrayList | Dynamic size and easy insertion | Slower access in some operations |
| HashMap | Fast average key-based lookup | Does not directly maintain parking order |

 5. Selected Data Structures
- Jagged arrays are used to represent floors with different parking capacities.
- ArrayList can manage dynamically changing vehicle records.
- HashMap can map vehicle registration numbers to parking tickets.
These structures are selected according to their specific responsibilities.

 6. System Validation
The system is evaluated for:
- Correct vehicle registration.
- Accurate parking slot allocation.
- Proper slot release.
- Correct parking fee calculation.
- Invalid input handling.
- Unique ticket generation.

 7. Conclusion
The Campus Smart-Parking System combines object-oriented programming, inheritance, polymorphism, encapsulation and suitable data structures. Testing helps verify system correctness, reliability and maintainability.
