import static java.lang.Math.*;

public class Task9 {

    /**
     * Performs addition using Math.addExact()
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    /**
     * Performs subtraction using Math.subtractExact()
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    /**
     * Performs multiplication using Math.multiplyExact()
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    /**
     * Performs division using Math.floorDiv()
     * @param a dividend
     * @param b divisor
     * @return floor division result
     */
    public static float divide(int a, int b) {
        // Using floorDiv for integer division, then casting to float
        // floorDiv always rounds down (towards negative infinity)
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   Math Operations with Static Import   ");
        System.out.println("========================================\n");

        // Test values
        int num1 = 50;
        int num2 = 15;

        // Demonstrate Addition
        System.out.println("--- ADDITION ---");
        System.out.println("Numbers: " + num1 + ", " + num2);
        int addResult = add(num1, num2);
        System.out.println("Result: " + num1 + " + " + num2 + " = " + addResult);
        System.out.println();

        // Demonstrate Subtraction
        System.out.println("--- SUBTRACTION ---");
        System.out.println("Numbers: " + num1 + ", " + num2);
        int subtractResult = subtract(num1, num2);
        System.out.println("Result: " + num1 + " - " + num2 + " = " + subtractResult);
        System.out.println();

        // Demonstrate Multiplication
        System.out.println("--- MULTIPLICATION ---");
        System.out.println("Numbers: " + num1 + ", " + num2);
        int multiplyResult = multiply(num1, num2);
        System.out.println("Result: " + num1 + " * " + num2 + " = " + multiplyResult);
        System.out.println();

        // Demonstrate Division
        System.out.println("--- DIVISION (Floor Division) ---");
        System.out.println("Numbers: " + num1 + ", " + num2);
        float divideResult = divide(num1, num2);
        System.out.println("Result: " + num1 + " / " + num2 + " = " + divideResult);
        System.out.println();

        // Additional test cases
        System.out.println("========================================");
        System.out.println("         ADDITIONAL TEST CASES          ");
        System.out.println("========================================\n");

        //int[] testCases = {100, 20, 7};

        // Test case 1
        System.out.println("Test Case 1: Numbers 100 and 20");
        System.out.println("Addition: " + add(100, 20));
        System.out.println("Subtraction: " + subtract(100, 20));
        System.out.println("Multiplication: " + multiply(100, 20));
        System.out.println("Division: " + divide(100, 20));
        System.out.println();

        // Test case 2
        System.out.println("Test Case 2: Numbers 7 and 3");
        System.out.println("Addition: " + add(7, 3));
        System.out.println("Subtraction: " + subtract(7, 3));
        System.out.println("Multiplication: " + multiply(7, 3));
        System.out.println("Division: " + divide(7, 3));
        System.out.println();

        // Test case 3 - with negative numbers
        System.out.println("Test Case 3: Numbers -25 and 5");
        System.out.println("Addition: " + add(-25, 5));
        System.out.println("Subtraction: " + subtract(-25, 5));
        System.out.println("Multiplication: " + multiply(-25, 5));
        System.out.println("Division: " + divide(-25, 5));
        System.out.println();

        // Test case 4 - Overflow handling
        System.out.println("Test Case 4: Demonstrating Overflow Protection");
        try {
            // This would cause overflow with regular addition
            long largeNum1 = Integer.MAX_VALUE;
            long largeNum2 = 1;
            System.out.println("Attempting to add Integer.MAX_VALUE + 1...");
            int overflowResult = addExact((int)largeNum1, (int)largeNum2);
            System.out.println("Result: " + overflowResult);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Math.addExact() prevents integer overflow!");
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println("       Program Execution Complete       ");
        System.out.println("========================================");
    }
}