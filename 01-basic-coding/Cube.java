/*
 * Problem: Cube
 *
 * Approach 1: Direct Calculation
 * Intuition:
 * The volume of a cube is side * side * side,
 * and its surface area is 6 * side * side.
 *
 * Approach:
 * Use these formulas directly to calculate the results.
 *
 * TC: O(1)
 * SC: O(1)
 *
 * Approach 2: Recursion
 * Intuition:
 * Calculate n^3 by multiplying n three times.
 *
 * Approach:
 * Keep multiplying n recursively until three
 * multiplications are completed, then return 1.
 *
 * TC: O(1)
 * SC: O(1), since recursion depth is fixed at 3.
 */

public class Cube {

    public static int calculateVolume(int side) {
        return side * side * side;
    }

    public static int calculateSurfaceArea(int side) {
        return 6 * side * side;
    }

    public static int calculateVolumeRecursive(int count, int side) {
        if (count > 3) {
            return 1;
        }

        return side * calculateVolumeRecursive(count + 1, side);
    }

    public static void main(String[] args) {
        int directVolume = calculateVolume(3);
        int recursiveVolume = calculateVolumeRecursive(1, 3);
        int surfaceArea = calculateSurfaceArea(3);

        System.out.println(directVolume + " " + recursiveVolume + " " + surfaceArea);
    }
}