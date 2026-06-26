public class Task8 {

    public static int computeCumulativeSums(int... numbers) {
        int grandTotal = 0;

        System.out.println("--- Processing Parameters ---");
        for (int num : numbers) {
            int cumulativeSum = 0;
            
            // Calculate the sum from 1 up to the parameter value
            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }
            
            System.out.println("Parameter: " + num + " -> Cumulative Sum: " + cumulativeSum);
            grandTotal += cumulativeSum;
        }
        
        return grandTotal;
    }

    public static void main(String[] args) {
        // Example case matching the prompt: (4, 5, 10)
        int[] inputParams = {4, 5, 10};
        
        System.out.println("Inputs provided: 4, 5, 10");
        int totalResult = computeCumulativeSums(inputParams);
        
        System.out.println("-----------------------------");
        System.out.println("Grand Total Sum: " + totalResult);
    }
}