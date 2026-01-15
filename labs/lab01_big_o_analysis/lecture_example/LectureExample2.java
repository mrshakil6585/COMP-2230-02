public class Example2 {
    public static void main(String[] args) {
        int n = 10; // Input size, can be changed

        long operations = 0;

        // Simulate 3n² operations: e.g., nested loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) { // 3 times for the coefficient
                    operations++; // Represents 3n² operations
                }
            }
        }

        // Simulate 2n operations: linear loop
        for (int i = 0; i < 2 * n; i++) {
            operations++; // 2n operations
        }

        // Simulate 1000*log(n) operations: log loop
        int logOps = (int) (1000 * Math.log(n) / Math.log(2)); // Approximate log2(n)
        for (int i = 0; i < logOps; i++) {
            operations++; // 1000*log(n) operations
        }

        // Simulate 5000 constant operations
        operations += 5000;

        System.out.println("Total operations for n=" + n + ": " + operations);

        // Analysis:
        // f(n) = 3n² + 2n + 1000*log(n) + 5000
        // As n grows large, the dominant term is 3n² (quadratic growth).
        // Ignoring lower order terms (2n, 1000*log(n), 5000), we get 3n².
        // Ignoring the constant coefficient 3, we get n².
        // Therefore, Big O is O(n²).
    }
}