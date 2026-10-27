
/*
 * Problem: Triangle
 *
 * Intuition:
 * A triangle is possible only if the sum of any two sides
 * is greater than the third side.
 *
 * Approach:
 * Check all three conditions. If any fails, the sides
 * cannot form a triangle.
 *
 * TC: O(1)
 * SC: O(1)
 */
public class Triangle {

    public static boolean canFormTriangle(int side1, int side2, int side3) {
        return side1 + side2 > side3
                && side2 + side3 > side1
                && side1 + side3 > side2;
    }

    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 2;
        int side3 = 4;

        System.out.println(
                canFormTriangle(side1, side2, side3)
                        ? side1 + side2 + side3
                        : -1
        );
    }
}
