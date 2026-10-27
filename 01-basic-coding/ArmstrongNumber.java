
/*
 * Problem: Armstrong Number (3-digit definition)
 *
 * Intuition:
 * A number is Armstrong if the sum of the cubes of its digits
 * equals the original number.
 *
 * Approach:
 * Extract each digit, calculate its cube, and add it to the sum.
 * If the running sum exceeds the original number, return false
 * early because the sum cannot decrease.
 *
 * TC: O(d), where d is the number of digits.
 * SC: O(1) auxiliary space.
 */

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        int sumOfCubeDigits = 0;
        int n = number;

        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;

            sumOfCubeDigits += lastDigit * lastDigit * lastDigit;

            if (sumOfCubeDigits > number) {
                return false;
            }
        }

        return sumOfCubeDigits == number;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }
}
