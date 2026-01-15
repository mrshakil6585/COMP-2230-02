public class ConditionalExample {
    public static void main(String[] args) {
        int n = 10;
        boolean condition = true; // Change to false to test the else branch

        long startTime = System.nanoTime();

        if (condition) {
            // Statement1: O(n) - linear loop
            for (int i = 0; i < n; i++) {
                System.out.println("Statement1: " + i);
            }
        } else {
            // Statement2: O(1) - constant time
            System.out.println("Statement2: Constant operation");
        }

        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

        // Analysis:
        // In if-else, only one branch executes.
        // Time = max(time(Statement1), time(Statement2)) = max(O(n), O(1)) = O(n)
        // Big O considers the worst-case scenario.
    }
}