
/*
 * Problem: Adjacent Zeros
 *
 * Intuition:
 * If two consecutive digits are both zero, the number
 * contains adjacent zeros.
 *
 * Approach:
 * Extract digits from right to left using % 10.
 * Track whether the previously extracted digit was zero.
 * If the current digit is also zero, return true.
 *
 * TC: O(d), where d is the number of digits.
 * SC: O(1) auxiliary space.
 */

public class AdjacentZeros {

    public static boolean checkAdjacentZeros(int n) {
        boolean previousZero = false;

        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;

            if (previousZero && lastDigit == 0) {
                return true;
            }

            if (lastDigit == 0) {
                previousZero = true;
            } else {
                previousZero = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 1011;
        System.out.println(checkAdjacentZeros(n) ? "Yes" : "No");
    }
}
