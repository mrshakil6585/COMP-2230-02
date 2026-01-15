public class NestedLoopExample {
    public static void main(String[] args) {
        int n = 5; // Outer loop size
        int m = 4; // Inner loop size

        long operations = 0;

        // Nested for loops: O(n * m)
        for (int i = 0; i < n; i++) { // Outer loop: n iterations
            for (int j = 0; j < m; j++) { // Inner loop: m iterations per outer
                // Statements: each execution counts as 1 operation
                operations++;
                System.out.println("i=" + i + ", j=" + j);
            }
        }

        System.out.println("Total operations: " + operations);

        // Analysis:
        // For nested loops, multiply the complexities: O(n) * O(m) = O(n*m)
        // If n == m, then O(n²)
        // The total time is the product of the loop bounds.
    }
}