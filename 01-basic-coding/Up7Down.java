
/*
 * Problem: 7 Up 7 Down
 *
 * Intuition:
 * Compare the number with 7 to determine whether it is
 * below, equal to, or above 7.
 *
 * Approach:
 * Use conditional statements to handle the three cases.
 *
 * TC: O(1)
 * SC: O(1)
 */
public class Up7Down {

    public static String compareWithSeven(int number) {
        if (number == 7) {
            return "EQUAL";
        } else if (number > 7) {
            return "UP";
        } else {
            return "DOWN";
        }
    }

    public static void main(String[] args) {
        int number = 2;
        System.out.println(compareWithSeven(number));
    }
}
