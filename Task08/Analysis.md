 TASK 08 – Method Overloading and Runtime Polymorphism
 1. Objective
To understand method overloading, compile-time polymorphism and runtime polymorphism using the Campus Smart-Parking System.

 2. Method Overloading
Method overloading occurs when multiple methods have the same name but different parameter lists.
Example:
```java
calculateFee(int hours);
calculateFee(int hours, double rate);
calculateFee(int hours, double rate, double discount);
```
It improves code readability and flexibility.

 3. Compile-Time Polymorphism
Compile-time polymorphism occurs when the compiler selects an overloaded method based on the arguments supplied.
It is also called static binding.

 4. Runtime Polymorphism
Runtime polymorphism occurs when a parent class reference points to a child class object and the overridden method is selected at runtime.
Example:
```java
Vehicle v = new Car();
v.calculateFee();
```
The Car implementation is executed.

 5. Difference Between Overloading and Overriding
| Overloading | Overriding |
|---|---|
| Same method name | Same method signature |
| Different parameters | Same parameters |
| Usually within the same class | Requires inheritance |
| Compile-time polymorphism | Runtime polymorphism |

 6. Application in Smart Parking
Method overloading can calculate parking fees using different inputs, such as hours, hourly rates and discounts.
Runtime polymorphism allows cars, two-wheelers and electric cars to calculate their parking fees differently.
## 7. Conclusion

Method overloading provides multiple ways to perform similar operations, while runtime polymorphism allows different vehicle classes to provide their own implementations. Both concepts improve flexibility and reusability in Java.
