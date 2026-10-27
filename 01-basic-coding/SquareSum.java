
/*
 * Problem: Square Sum
 *
 * Intuition:
 * The result is the sum of the squares of all digits
 * in the given number.
 *
 * Approach:
 * Extract the last digit using % 10, square it, and add it
 * to the sum. Remove the last digit using / 10 and repeat
 * until no digits remain.
 *
 * TC: O(d), where d is the number of digits.
 * SC: O(1) auxiliary space.
 */

public class SquareSum {

    public static int calculateSum(int number) {
        int sumOfSquaredDigits = 0;
        int n = number;

        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;

            sumOfSquaredDigits += lastDigit * lastDigit;
        }

        return sumOfSquaredDigits;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(calculateSum(n));
    }
}
