 TASK 06 – Inheritance and Constructor Chaining
 1. Objective
To understand inheritance, the `super` keyword and constructor chaining in Java using the Campus Smart-Parking System.
 2. Inheritance
Inheritance is an object-oriented programming concept in which one class acquires the properties and methods of another class.
Example:
- Parent class: Vehicle
- Child classes: Car, TwoWheeler and ElectricCar
 3. Inheritance Hierarchy
```text
             Vehicle
                |
       -------------------
       |        |        |
      Car   TwoWheeler  ElectricCar
```
 4. Advantages of Inheritance
1. Code reusability.
2. Reduced code duplication.
3. Easy maintenance.
4. Supports method overriding.
5. Improves program organisation.
 
 5. Use of the `super` Keyword
The `super` keyword refers to the immediate parent class.
It is used to:
- Call the parent class constructor.
- Access parent class variables.
- Call parent class methods.
Example:
```java
class Vehicle {
    String registrationNo;

    Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
    }
}

class Car extends Vehicle {
    Car(String registrationNo) {
        super(registrationNo);
    }
}
```

 6. Constructor Chaining
Constructor chaining occurs when a child class constructor calls its parent class constructor using `super()`.
The parent constructor executes before the child constructor.

 7. Alternative Design: Composition
Instead of inheritance, composition can be used to represent relationships between objects.
| Inheritance | Composition |
|---|---|
| Represents an IS-A relationship | Represents a HAS-A relationship |
| Uses `extends` | Uses object references |
| Shares parent behaviour | Combines separate objects |
| Example: Car IS-A Vehicle | ParkingFacility HAS-A ParkingSlot |
## 8. Conclusion

Inheritance allows the parking system to reuse common vehicle properties and methods. The `super` keyword supports parent constructor execution, while constructor chaining ensures proper object initialisation. Composition is an alternative when objects have a HAS-A relationship.
