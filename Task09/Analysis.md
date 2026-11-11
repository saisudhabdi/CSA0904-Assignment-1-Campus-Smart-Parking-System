 TASK 09 – Abstract Classes and Interfaces
 1. Objective
To understand abstract classes and interfaces in Java using the Campus Smart-Parking System.

 2. Abstract Classes
An abstract class is a class declared using the `abstract` keyword. It cannot be instantiated directly.
It can contain:
- Abstract methods without a body.
- Concrete methods with a body.
- Variables and constructors.
Example: Vehicle can be an abstract class because every vehicle has common properties but different parking fee calculations.

 3. Interfaces
An interface defines a contract that implementing classes must follow.
It is declared using the `interface` keyword and implemented using `implements`.
Example: An ElectricCar can implement a Chargeable interface.

 4. Abstract Class vs Interface
| Abstract Class | Interface |
|---|---|
| Uses `abstract class` | Uses `interface` |
| Can have constructors | Cannot have constructors |
| Supports instance variables | Fields are public, static and final by default |
| A class extends one class | A class can implement multiple interfaces |
| Provides shared state and behaviour | Defines a common contract |

 5. Application in Smart Parking
The abstract Vehicle class stores common vehicle information and declares an abstract `calculateFee()` method.
The Chargeable interface defines a `chargeBattery()` method for electric vehicles.
This separates common vehicle behaviour from electric charging functionality.

 6. Alternative Design
Instead of using an abstract class and interface, all functionality could be implemented in one normal class.
However, this may cause code duplication and make future extensions difficult.

 7. Conclusion
Abstract classes provide common properties and behaviour, while interfaces define capabilities that different classes can implement. These concepts improve flexibility, reusability and maintainability in the parking system.
