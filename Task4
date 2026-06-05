import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.class);
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        
        // 1. Use StringBuilder to create a new string that is a reverse of the input string
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        
        // 2. Use the equals() method to check if the input string and the reversed string are the same
        if (input.equals(reversed)) {
            // 3. If the strings are the same, print the success message
            System.out.println("The input string is a palindrome.");
        } else {
            // 4. If the strings are not the same, print the failure message
            System.out.println("The input string is not a palindrome.");
        }
        
        // Close the scanner resource
        scanner.close();
    }
}
