/*
 * Problem: Candies
 *
 * Intuition:
 * If the number of candies is exactly divisible by the
 * given number, there is no remainder.
 *
 * Approach:
 * Check whether candies % cousins == 0.
 *
 * TC: O(1)
 * SC: O(1)
 */
public class Candies {

    public static boolean canDivideEvenly(int candies, int cousins) {
        return candies % cousins == 0;
    }

    public static void main(String[] args) {
        int candies = 35;
        int cousins = 10;

        System.out.println(
            canDivideEvenly(candies, cousins) ? "YES" : "NO"
        );
    }
}