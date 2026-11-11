 Task 12 – Design Challenge and System Extension
 1. New Requirements
The Campus Smart-Parking System must support:
- E-Bikes: A fixed parking fee of Rs 20.
- Delivery Vans: Double the normal car parking fee between 9:00 AM and 5:00 PM.
- Visitors: A one-day parking pass.
- Five Floors: Each floor has a different parking capacity.

 2. Design Changes
The existing Vehicle class can be extended using inheritance.
New classes:
- `EBike` – calculates a fixed parking fee.
- `DeliveryVan` – calculates double the car fee during the specified time.
- `VisitorPass` – stores visitor details and pass validity.
- `ParkingFacility` – manages five floors with different capacities.

 3. Design Decisions
Inheritance is retained because different vehicle types share common properties. Method overriding allows each vehicle to calculate its parking fee differently.
A jagged array is used because each floor has a different number of parking slots.

 4. Validation and Testing
The system should be tested for:
- E-bike fixed fee.
- Delivery van fee during and outside restricted hours.
- Visitor pass validity.
- Parking allocation across five floors.
- Full parking facility and invalid slot conditions.

 5. Conclusion
The system is extended using object-oriented principles. Inheritance, method overriding, encapsulation and jagged arrays make the parking system easier to maintain and expand.
