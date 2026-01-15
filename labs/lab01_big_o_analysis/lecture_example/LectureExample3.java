public class LectureExample3 {
    public static void main(String[] args) {
        int n = 5; // Keep small due to cubic growth

        long operations = 0;

        // Simulate 3n³ operations: triple nested loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < 3; l++) { // 3 times for coefficient
                        operations++; // 3n³ operations
                    }
                }
            }
        }

        // Simulate 2n² operations: double nested loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 2; k++) { // 2 times
                    operations++; // 2n² operations
                }
            }
        }

        // Simulate 5n operations: linear
        for (int i = 0; i < 5 * n; i++) {
            operations++; // 5n operations
        }

        // Simulate 1 constant operation
        operations += 1;

        System.out.println("Total operations for n=" + n + ": " + operations);

        // Analysis:
        // f(n) = 3n³ + 2n² + 5n + 1
        // As n grows large, the dominant term is 3n³ (cubic growth).
        // Ignoring lower order terms (2n², 5n, 1), we get 3n³.
        // Ignoring the constant coefficient 3, we get n³.
        // Therefore, Big O is O(n³).
    }
}