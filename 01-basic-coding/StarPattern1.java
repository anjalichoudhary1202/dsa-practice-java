
/*
 * Problem: Star Pattern 1
 *
 * Intuition:
 * Each row contains as many stars as its row number.
 *
 * Approach:
 * Use an outer loop to control the rows and an inner loop
 * to print stars from 1 up to the current row number.
 * Print a newline after each row.
 *
 * TC: O(n²)
 * SC: O(1) auxiliary space
 */
public class StarPattern1 {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}
