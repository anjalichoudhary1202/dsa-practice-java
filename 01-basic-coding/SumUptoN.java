/*
 * Problem: Sum Up To N
 *
 * Approach 1: Iteration
 * Intuition:
 * Add each number from 1 to n to a running sum.
 *
 * Approach:
 * Initialize sum to 0 and use a loop from 1 to n,
 * adding each number to sum.
 *
 * TC: O(n)
 * SC: O(1)
 *
 * Approach 2: Recursion
 * Intuition:
 * The sum up to n is n plus the sum up to n-1.
 *
 * Approach:
 * Return 0 when n becomes 0. Otherwise, return n +
 * sumNRecursive(n-1).
 *
 * TC: O(n)
 * SC: O(n) due to the recursion stack.
 */

public class SumUptoN {

  public static void sumNIterative(int n) {
    int sum = 0;
    for(int i=1;i<=n;i++) {
      sum += i;
    }

    System.out.println(sum);
  }

  public static int sumNRecursive(int n) {
    if(n == 0) return 0;
    return n + sumNRecursive(n-1);
  }
  public static void main(String[] args) {
    sumNIterative(5);
    int sum = sumNRecursive(5);
    System.out.println(sum);
  }  
}
