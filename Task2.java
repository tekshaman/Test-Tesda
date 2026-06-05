public class Task2 {
    public static void main(String[] args) {
        
        // Creating the primitives (excluding long and double) with different values
        byte b = 3;
        short s = 110;
        int i = 0;
        float f = 2.0f;
        boolean bool = true;
        char c = 'r';

        // Concatenating them to output: H3110 w0r1d 2.0 true
        String output = "H" + b + s + " w" + i + c + "1d " + f + " " + bool;
        
        // Printing the result to the screen
        System.out.println(output);
    }
}
