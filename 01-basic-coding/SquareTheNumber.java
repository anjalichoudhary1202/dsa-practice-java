
/*
 * Problem: Square the Number
 *
 * Intuition:
 * The square of a number is the number multiplied by itself.
 *
 * Approach:
 * Multiply n by n and return the result.
 *
 * TC: O(1)
 * SC: O(1) auxiliary space.
 */

public class SquareTheNumber {

    public static int findSquare(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(findSquare(n));
    }
}
