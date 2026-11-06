# TASK 1 – UNDERSTAND THE PROBLEM AND IDENTIFY THE OBJECTS

## 1. Problem Analysis

The Campus Smart-Parking System manages parking spaces
for students, staff and visitors. It allocates available
slots, generates parking tickets and calculates parking
fees based on vehicle type and parking duration.

## 2. Inputs

- Vehicle registration number
- Vehicle type
- Entry time
- Exit time
- Floor and slot details
- Monthly pass validity
- Charging units for electric vehicles

## 3. Outputs

- Allocated parking floor and slot
- Unique parking ticket number
- Vehicle entry and exit records
- Parking duration
- Total parking fee
- Available parking slots

## 4. Candidate Classes and Responsibilities

| Class | Responsibility |
|---|---|
| Vehicle | Stores vehicle details |
| TwoWheeler | Represents two-wheelers |
| Car | Represents cars |
| ElectricVehicle | Represents electric vehicles |
| ParkingSlot | Manages individual slots |
| ParkingFloor | Manages slots on each floor |
| ParkingFacility | Manages the complete parking facility |
| ParkingTicket | Stores ticket and timing details |
| User | Represents parking users |
| ParkingPass | Validates monthly passes |

## 5. Methods

- allocateSlot() – Allocates a free slot.
- releaseSlot() – Releases an occupied slot.
- generateTicket() – Generates a unique ticket.
- calculateFee() – Calculates parking charges.
- validatePass() – Checks pass validity.
- findVehicle() – Searches for a vehicle.

## 6. Business Rules

1. A parking slot cannot contain two vehicles.
2. Every ticket must have a unique number.
3. Only suitable free slots can be allocated.
4. Monthly pass holders who are eligible park free.
5. Visitors must pay the applicable parking fee.
6. Electric vehicles can use charging slots.
7. An occupied slot must be released after exit.
8. Invalid registration numbers must be rejected.

## 7. Assumptions

- Every vehicle has a unique registration number.
- Parking slots are numbered separately on each floor.
- Parking fees are calculated using parking duration.
- Every started hour is charged as a complete hour.
- Monthly passes must be valid at the time of entry.

## 8. Alternative Concept and Complexity Analysis

Instead of creating Vehicle objects, vehicles can be
stored using parallel arrays:

- regNo[]
- type[]
- entryTime[]

Searching for a vehicle requires checking each registration
number sequentially.

Object-oriented design:
- Search: O(n)
- Adding a new attribute: Modify the Vehicle class.

Parallel array design:
- Search: O(n)
- Adding a new attribute: Create another parallel array
  and maintain matching indexes.

Conclusion:

Object-oriented design is better because it combines
data and behaviour into classes, improves maintainability
and supports inheritance and polymorphism.
