
/*
 * Problem: Digit Sum
 *
 * Intuition:
 * The result is the sum of all digits in the given number.
 *
 * Approach:
 * Extract the last digit using % 10 and add it to the sum.
 * Remove the last digit using / 10 and repeat until no
 * digits remain.
 *
 * TC: O(d), where d is the number of digits.
 * SC: O(1) auxiliary space.
 */

public class DigitSum {

    public static int calculateSum(int number) {
        int sumOfDigits = 0;
        int n = number;

        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;

            sumOfDigits += lastDigit;
        }

        return sumOfDigits;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(calculateSum(n));
    }
}
