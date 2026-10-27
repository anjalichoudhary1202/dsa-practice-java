
/*
 * Problem: Divisible By Six
 *
 * Intuition:
 * A number is divisible by 6 if the remainder is 0
 * when divided by 6.
 *
 * Approach:
 * Use the modulo operator to check divisibility.
 *
 * TC: O(1)
 * SC: O(1)
 */

public class DivisibleBySix {

    public static boolean isDivisibleBySix(int number) {
        return number % 6 == 0;
    }

    public static void main(String[] args) {
        int number = 35;
        System.out.println(isDivisibleBySix(number));
    }
}
