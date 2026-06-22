import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform operations and display results
        System.out.println("\n--- output ---");
        System.out.println("Addition: " + plus(num1, num2));
        System.out.println("Subtraction: " + minus(num1, num2));
        System.out.println("Multiplication: " + times(num1, num2));
        
        //make sure the second number is not zero before performing division
        if (num2 != 0) {
            System.out.println("Division: " + divide(num1, num2));
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        scanner.close();
    }

    // Method for Addition
    public static double plus(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double minus(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double times(double a, double b) {
        return a * b;
    }

    // Method for Division
    public static double divide(double a, double b) {
        return a / b;
    }
}