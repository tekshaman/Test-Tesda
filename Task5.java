//test
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        
        // 1. Check if all three numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            // 2. Find the largest number using Math.max or if-else logic
            double largest = num1;
            
            if (num2 > largest) {
                largest = num2;
            }
            if (num3 > largest) {
                largest = num3;
            }
            
            // 3. Output the largest number
            System.out.println("The largest number is: " + largest);
        }
        
        // Close the scanner resource
        scanner.close();
    }
}
