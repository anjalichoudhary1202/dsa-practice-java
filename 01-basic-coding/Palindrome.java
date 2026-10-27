
/*
 * Problem: Palindrome
 *
 * Intuition:
 * A palindrome reads the same forwards and backwards.
 *
 * Approach:
 * Compare characters from both ends, moving toward the center.
 * If any pair differs, return false.
 *
 * TC: O(n)
 * SC: O(1) auxiliary space
 */

public class Palindrome {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "madame";
        System.out.println(isPalindrome(str) ? "True" : "False");
    }
}
