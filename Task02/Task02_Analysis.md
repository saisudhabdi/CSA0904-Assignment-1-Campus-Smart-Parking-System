
# TASK 2 – CHOOSE THE DATA REPRESENTATION

## 1. Data Types and Their Uses

| Field | Data Type | Reason |
|---|---|---|
| Slot Number | int | Stores slot position |
| Floor Number | int | Stores floor number |
| Vehicle Number | String | Stores registration number |
| Entry Time | LocalDateTime | Stores entry date and time |
| Exit Time | LocalDateTime | Stores exit date and time |
| Duration | long | Stores parking duration in minutes |
| Parking Fee | double | Stores decimal fee values |
| Vehicle Type | String | Identifies vehicle category |
| Pass Validity | boolean | Checks pass validity |

## 2. Array Representation

A jagged two-dimensional array is used to represent parking floors and slots.

Example:

String[][] slots = new String[3][];

slots[0] = new String[20];
slots[1] = new String[50];
slots[2] = new String[100];

Each row represents a floor, and each element represents a parking slot.

A null value indicates that the slot is free.

A jagged array is suitable because different floors can contain different numbers of slots.

## 3. Type Conversion and Casting

Type conversion is required when calculating parking duration and fees.

For example:

int minutes = 90;
double hours = Math.ceil(minutes / 60.0);
double fee = hours * 30.0;

The result is 2 billable hours and a fee of Rs. 60.

## 4. Integer Division Risk

Incorrect calculation:

int hours = 90 / 60;

Output: 1

This produces an incorrect billing duration because integer division removes the decimal part.

Correct calculation:

double hours = Math.ceil(90 / 60.0);

Output: 2.0

Using double prevents precision loss during the calculation.

## 5. Input Method

The Scanner class is used to read input from the keyboard.

Example:

Scanner sc = new Scanner(System.in);
String vehicleNo = sc.nextLine();
int floor = sc.nextInt();

Scanner is suitable for interactive parking system operations.

## 6. Alternative Concept and Complexity Analysis

### One-Dimensional Array

A single array can represent all parking slots using:

index = floor * slotsPerFloor + slot

This works when every floor has the same number of slots.

However, it becomes difficult when floors have different numbers of slots.

### ArrayList

An ArrayList<String[]> can store separate slot arrays for each floor.

It supports different numbers of slots on different floors and allows flexible management.

## 7. Complexity Analysis

| Representation | Slot Access | Space |
|---|---|---|
| Jagged Array | O(1) | O(N) |
| One-Dimensional Array | O(1) | O(N) |
| ArrayList<String[]> | O(1) indexed access | O(N) |

N represents the total number of parking slots.

## 8. Conclusion

A jagged two-dimensional array is selected because it supports different numbers of slots on different floors.

Appropriate data types ensure accurate storage and fee calculation. Using double avoids integer division errors, while Scanner provides simple keyboard input.
