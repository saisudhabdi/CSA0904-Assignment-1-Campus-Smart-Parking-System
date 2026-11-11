 TASK 04 – Constructors, Objects and Memory Management
 1. Objective
To understand object creation, constructors, the `this` keyword and memory management in Java using a Campus Smart-Parking System.
 2. Classes and Objects
A class is a blueprint used to create objects. An object represents a real-world entity with data and behaviour.
Example:
- Class: Vehicle
- Objects: Car, Bike and Electric Car
 3. Constructors
A constructor is a special method used to initialise an object. It has the same name as the class and does not have a return type.
Types of constructors:
1. Default constructor – Initialises an object with default values.
2. Parameterised constructor – Initialises an object using supplied values.
3. Copy constructor – Creates a new object by copying another object's values. Java does not provide a built-in copy constructor; it must be defined by the programmer.
 4. Use of the `this` Keyword
The `this` keyword refers to the current object. It helps distinguish instance variables from constructor parameters with the same names.
Example:
```java
this.registrationNo = registrationNo;
```
5. Object Memory Management
- Objects are created using the `new` keyword.
- Objects are stored in heap memory.
- Local variables and references are generally stored in stack frames.
- Java garbage collection automatically reclaims memory occupied by objects that are no longer reachable.
 6. Constructor Example
A Vehicle class can use constructors to initialise registration number and vehicle type.
```java
Vehicle v1 = new Vehicle("TN01AB1111", "Car");
Vehicle v2 = new Vehicle(v1);
```
Here, `v1` is created using a parameterised constructor, while `v2` is created using a copy constructor.
 7. Alternative Design
Instead of using multiple constructors, objects can be created using setter methods or factory methods.
| Method | Advantage | Disadvantage |
|---|---|---|
| Constructors | Initialise objects immediately | Less flexible after creation |
| Setter methods | Allow values to change | Can create partially initialised objects |
| Factory methods | Can control object creation | Require additional methods |
## 8. Conclusion

Constructors simplify object initialisation and improve code organisation. The `this` keyword helps access current object members, while Java garbage collection manages unused objects automatically. These concepts support reliable object-oriented design in the Campus Smart-Parking System.
