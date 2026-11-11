 TASK 10 – Packages, Access Modifiers and Encapsulation
 1. Objective
To understand packages, access modifiers, encapsulation, data validation and wrapper classes in Java using the Campus Smart-Parking System.

 2. Packages
A package is a collection of related Java classes and interfaces.
Advantages:
- Organises program files.
- Avoids naming conflicts.
- Improves code reusability.
- Provides access protection.
Example:
```java
package parking;
```

 3. Access Modifiers
Java provides four access levels:
| Modifier | Accessibility |
|---|---|
| public | Accessible from anywhere |
| private | Accessible only within the same class |
| protected | Accessible within the same package and subclasses |
| default | Accessible within the same package |

 4. Encapsulation
Encapsulation is the process of combining data and methods into a single class while restricting direct access to data.
Example:
```java
class Vehicle {
    private String registrationNo;

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }
}
```

 5. Data Validation
Data validation ensures that incorrect information is not accepted.
Examples:
- Registration number must not be empty.
- Parking fee must not be negative.
- Vehicle type must be valid.
- Parking slot must be within the available range.

 6. Wrapper Classes and Autoboxing
Wrapper classes convert primitive data types into objects.
Examples:
- int – Integer
- double – Double
- char – Character
- boolean – Boolean
Autoboxing automatically converts a primitive into its wrapper object. Unboxing converts a wrapper object into a primitive.

 7. Alternative Design
Instead of encapsulation, public variables could be used. However, this allows uncontrolled modification of data.
Encapsulation is preferred because it improves security, validation and maintainability.

 8. Conclusion
Packages organise Java programs, access modifiers control visibility, and encapsulation protects data. Validation and wrapper classes improve the reliability and flexibility of the Campus Smart-Parking System.
