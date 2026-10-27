
/*
 * Problem: Vowels
 *
 * Intuition:
 * Each friend receives candies equal to the number of vowels
 * in their name.
 *
 * Approach 1: Using OR (||) conditions
 * Traverse each character and check whether it matches
 * any of the five vowels: a, e, i, o, u.
 *
 * Approach 2: Using indexOf()
 * Check whether the character exists in the string "aeiou".
 * If indexOf() returns -1, the character is not a vowel;
 * otherwise, it is a vowel.
 *
 * TC: O(n * m), where n is the number of friends and
 * m is the maximum length of a name.
 * SC: O(m) auxiliary space due to the lowercase string.
 */

public class Vowels {

    public static int countVowels(String name) {
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char currentCharacter = name.charAt(i);

            // Approach 1: Using OR (||) conditions
            /*
            if (currentCharacter == 'a' || currentCharacter == 'e'
                    || currentCharacter == 'i' || currentCharacter == 'o'
                    || currentCharacter == 'u') {
                count++;
            }
            */

            // Approach 2: Using indexOf()
            if ("aeiou".indexOf(currentCharacter) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void distributeCandies(String[] friends) {
        for (int i = 0; i < friends.length; i++) {
            int totalVowels = countVowels(friends[i].toLowerCase());
            System.out.println(totalVowels);
        }
    }

    public static void main(String[] args) {
        String[] friends = {"Neha", "Rajan", "Aamir", "Bonnie", "Ram"};
        distributeCandies(friends);
    }
}
