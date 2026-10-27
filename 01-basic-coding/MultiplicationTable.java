
/*
 * Problem: Multiplication Table
 *
 * Intuition:
 * Each value in the table is the given number multiplied
 * by a number from 1 to 10.
 *
 * Approach:
 * Loop from 1 to 10 and print the product at each step.
 *
 * TC: O(1)
 * SC: O(1) auxiliary space
 */

public class MultiplicationTable {

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(3);
    }
}
