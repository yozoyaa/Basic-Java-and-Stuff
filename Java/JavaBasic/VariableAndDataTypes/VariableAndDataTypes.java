package JavaBasic.VariableAndDataTypes;

public class VariableAndDataTypes {
    // Primitive Data Types: Include int, double, char, boolean, and others.
    int myInt = 5;             // Integer
    double myDouble = 5.99;    // Double precision number
    char myChar = 'A';         // Single character
    boolean myBool = true;     // Boolean value (true or false)

    /*Operators
    Java provides a rich set of operators to perform various operations.

    Arithmetic Operators: +, -, *, /, %
    Relational Operators: ==, !=, >, <, >=, <=
    Logical Operators: && (logical AND), || (logical OR), ! (logical NOT) */

    // Arithmetic Operators
    int sum = 10 + 5;          // 15
    int diff = 10 - 5;         // 5
    int product = 10 * 5;      // 50
    double quotient = 10 / 3;  // 3.333...
    int remainder = 10 % 3;    // 1

    // Relational Operators
    boolean isEqual = (10 == 5);           // false
    boolean isNotEqual = (10 != 5);        // true
    boolean isGreaterThan = (10 > 5);      // true
    boolean isLessThan = (10 < 5);         // false

    // Logical Operators
    boolean andResult = (5 > 1) && (5 < 10);  // true (both conditions are true)
    boolean orResult = (5 < 1) || (5 < 10);   // true (at least one condition is true)
    boolean notResult = !(5 == 5);            // false (5 == 5 is true, logical NOT makes it false)
}
