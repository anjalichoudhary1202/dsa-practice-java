
import java.util.Arrays;

public class WinOrLose {

    /*
     * Problem: Win Or Lose
     *
     * Approach 1: Brute Force (Sorting)
     * Intuition:
     * Sorting the array places the maximum element at the end.
     *
     * Approach:
     * Sort the array and return the last element.
     *
     * TC: O(n log n)
     * SC: Depends on the sorting implementation.
     */
    
    public static int findMaximumBruteForce(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    /*
     * Approach 2: Optimal (Linear Scan)
     * Intuition:
     * Track the largest number while traversing the array once.
     *
     * Approach:
     * Initialize maximum with the first element and update
     * it whenever a larger element is found.
     *
     * TC: O(n)
     * SC: O(1)
     */
    public static int findMaximumOptimal(int[] numbers) {
        int maximum = numbers[0];

        for (int number : numbers) {
            maximum = Math.max(maximum, number);
        }

        return maximum;
    }

    public static boolean canTheyWin(int[] numbers) {
        int maximum = findMaximumOptimal(numbers);
        return maximum % 2 == 0;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 234, 5674, 122};

        System.out.println(canTheyWin(numbers) ? "WIN" : "LOSE");
    }
}
