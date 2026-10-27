
/*
 * Problem: One Character Line
 *
 * Intuition:
 * Access each character of the string one by one.
 *
 * Approach:
 * Traverse the string using a loop and print each character.
 *
 * TC: O(n)
 * SC: O(1) auxiliary space
 */

public class OneCharacterLine {

    public static void printCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            System.out.println(currentCharacter);
        }
    }

    public static void main(String[] args) {
        String str = "WORKATTECH";
        printCharacters(str);
    }
}
