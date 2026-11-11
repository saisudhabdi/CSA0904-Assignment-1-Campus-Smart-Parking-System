# TASK 3 – Design the Control Logic

## 3.1 Slot Allocation Algorithm

**Purpose:** To find the first available parking slot and assign a vehicle to it.

### Pseudocode

BEGIN

1. Read vehicle registration number.
2. FOR each floor in the parking facility:
   3. FOR each slot in the current floor:
      4. IF the slot is empty:
         - Assign the vehicle registration number to the slot.
         - Display the allocated floor and slot.
         - RETURN the floor and slot numbers.
      5. END IF
   6. END FOR
7. END FOR
8. IF no free slot is found:
   - RETURN NULL.
9. END IF

END

## 3.2 Parking Fee Calculation Algorithm

**Purpose:** To calculate the parking fee based on parking duration and vehicle type.

### Pseudocode

BEGIN

1. Read parking duration in minutes.
2. Read vehicle type.
3. IF duration is less than or equal to zero:
   - Set parking fee to zero.
4. ELSE:
   - Calculate billable hours using ceiling division:
     hours = (minutes + 59) / 60.
5. Select the vehicle's hourly rate:
   - Two-wheeler = Rs. 10.
   - Car = Rs. 30.
   - Electric car = Rs. 30.
6. Calculate fee = hours × hourly rate.
7. IF a valid free parking pass exists:
   - Set parking fee to zero.
8. Display the parking fee.
END
## 3.3 Use of break, continue and return
- break: Stops a loop when a suitable free slot is found.
- continue: Skips an occupied slot and checks the next slot.
- return: Immediately returns the allocated slot or NULL when no slot is available.
## 3.4 Handling Full Parking
If all parking slots are occupied, the allocate() method returns null. The system informs the user that no suitable parking slot is available.
## 3.5 Conclusion
The control logic uses nested loops and conditional statements to allocate parking slots efficiently. Fee calculation uses if-else statements and integer arithmetic to calculate the correct parking charge.
## 3.6 Alternative Concept – Stack of Free Slots
Instead of scanning every floor and slot, we can maintain a stack of available parking positions for each floor.
Each stack stores the free slot numbers.
### Allocation
1. Check whether a floor has available slots.
2. Remove a free slot from its stack using pop().
3. Assign the vehicle to that slot.
4. Return its floor and slot numbers.
### Release
1. Validate the floor and slot.
2. Check whether the slot is occupied.
3. Release the slot.
4. Push its slot number back into the corresponding stack.
### Complexity Comparison
| Operation | Nested Array Search | Stack Approach |
|---|---|---|
| Allocation | O(F × S) worst case | O(F) worst case |
| Release | O(1) | O(1) |
| Extra space | O(1) | O(F × S) |
Here, F represents the number of floors and S represents the maximum slots per floor.
The stack approach can provide faster allocation because it directly retrieves a free slot. However, it requires additional memory and careful synchronisation between the stack and parking array.
### Conclusion
The nested array approach is selected for the initial implementation because it is simple and suitable for a small parking facility. A stack-based approach can be introduced when the facility becomes larger and faster allocation is required.
