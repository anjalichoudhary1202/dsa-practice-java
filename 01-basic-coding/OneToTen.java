/*
 * Problem: One To Ten
 * Link: https://workat.tech/problem-solving/practice/one-to-ten
 *
 * Approach 1: Iteration
 * Intuition:
 * Start from 1 and print each number until n.
 *
 * Approach:
 * Use a for loop from 1 to n.
 *
 * TC: O(n)
 * SC: O(1)
 *
 * Approach 2: Recursion
 * Intuition:
 * Print numbers from 1 to n by first printing 1 to n-1,
 * then printing n.
 *
 * Approach:
 * Call the function with n-1 until n becomes 0.
 * Print n while the recursive calls return.
 *
 * TC: O(n)
 * SC: O(n) due to the recursion stack.
 */

public class OneToTen {

  public static void printNumbersIterative(int n) {
    for(int i=1;i<=n;i++) {
      System.out.println(i);
    }
  }
  public static void printNumbersRecursive(int n) {
    if(n == 0) return;

    printNumbersRecursive(n-1);
    System.out.println(n);
  }
  public static void main(String[] args) {
    // printNumbersRecursive(5);
    printNumbersIterative(5);
  }
}
