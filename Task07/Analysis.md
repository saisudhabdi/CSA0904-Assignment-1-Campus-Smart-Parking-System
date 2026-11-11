 TASK 07 – Method Overriding and Object Methods
 1. Objective
To understand method overriding, the @Override annotation, final keyword and important Object class methods in Java.

 2. Method Overriding
Method overriding occurs when a child class provides its own implementation of a method inherited from its parent class.
Example: Car and ElectricCar can calculate parking fees differently.

 3. @Override Annotation
The @Override annotation informs the compiler that a method is intended to override a parent class method. It helps detect incorrect method signatures.

 4. final Keyword
The final keyword is used to restrict modification.
- Final variable: Cannot be reassigned after initialisation.
- Final method: Cannot be overridden by subclasses.
- Final class: Cannot be extended.

 5. Important Object Methods
equals(): Compares objects based on logical equality.
hashCode(): Returns a hash value used in hash-based collections. It must be consistent with equals().
toString(): Returns a readable string representation of an object.

 6. Alternative Design
Instead of overriding methods in every subclass, a switch statement or separate fee-calculation service can be used.
| Method | Advantage |
|---|---|
| Method overriding | Supports runtime polymorphism |
| Switch statement | Simple for a small number of vehicle types |
| Separate service | Keeps fee logic independent |
## 7. Conclusion

Method overriding allows different vehicle types to calculate parking fees independently. The final keyword protects important data and behaviour, while equals(), hashCode() and toString() improve object comparison and representation.
