
/*
 * Problem: Two Character Line
 *
 * Intuition:
 * Print the string in pairs of two characters.
 *
 * Approach:
 * Move through the string in steps of 2 and print each pair.
 * If the length is odd, the last character is ignored.
 *
 * TC: O(n)
 * SC: O(1) auxiliary space
 */
public class TwoCharacterLine {

    public static void printTwoCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i += 2) {
            String pair = "" + str.charAt(i) + str.charAt(i + 1);
            System.out.println(pair);
        }
    }

    public static void main(String[] args) {
        String str = "WORKATTECH";
        printTwoCharacters(str);
    }
}
