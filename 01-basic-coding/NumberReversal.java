
/*
 * Problem: Number Reversal
 *
 * Approach 1: Iteration
 * Intuition:
 * Extract the last digit and append it to the reversed number.
 *
 * Approach 2: Recursion
 * Intuition:
 * Pass the reversed number along with the remaining number.
 * Extract one digit per call until no digits remain.
 *
 * TC: O(d) for both approaches
 * SC: O(1) iterative, O(d) recursive
 * d = number of digits
 */
public class NumberReversal {

    public static int reverseNumberRecursive(int number, int reversedNumber) {
        if (number == 0) {
            return reversedNumber;
        }

        return reverseNumberRecursive(
                number / 10,
                reversedNumber * 10 + number % 10
        );
    }

    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 237;
        System.out.println(reverseNumberRecursive(number, 0));
    }
}
