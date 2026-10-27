
/*
 * Problem: Not Divisible
 *
 * Intuition:
 * Print numbers from 1 to n, excluding numbers divisible by 3.
 *
 * Approach:
 * Traverse numbers from 1 to n.
 * If i % 3 != 0, print the number because it is not
 * divisible by 3.
 *
 * TC: O(n), where n is the given limit.
 * SC: O(1) auxiliary space.
 */

public class NotDivisible {

    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }
}
