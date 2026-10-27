
/*
 * Problem: Max in Matrix
 *
 * Intuition:
 * The maximum element is the largest value among all
 * elements in the matrix.
 *
 * Approach:
 * Initialize maxi to Integer.MIN_VALUE.
 * Traverse every row and column, updating maxi whenever
 * a larger element is found.
 * Return maxi after visiting all elements.
 *
 * TC: O(n * m), where n is the number of rows and m is
 * the number of columns.
 * SC: O(1) auxiliary space.
 */

public class MaxInMatrix {

    public static int findMaxElement(int[][] mat, int n, int m) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxi = Math.max(maxi, mat[i][j]);
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] mat = {
            {32, 45, 12},
            {33, 11, 22}
        };

        System.out.println(findMaxElement(mat, n, m));
    }
}
