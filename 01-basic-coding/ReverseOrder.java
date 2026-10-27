
/*
 * Problem: Reverse Order
 *
 * Intuition:
 * Print the array elements starting from the last element.
 *
 * Approach:
 * Traverse the array backwards using index n - 1 to 0.
 *
 * TC: O(n)
 * SC: O(1) auxiliary space
 */

public class ReverseOrder {
    public static void printReverseOrder(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {34, 12, 56, 2, 1};
        printReverseOrder(numbers);
    }
}
