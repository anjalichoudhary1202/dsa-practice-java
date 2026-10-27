
import java.util.Scanner;

/*
 * Problem: Guess
 *
 * Intuition:
 * Keep accepting guesses until the guessed date matches
 * the actual birthday date.
 *
 * Approach:
 * Read the birthday date first.
 * Then repeatedly read guesses and compare each guess
 * with the birthday date.
 * Print "Incorrect Guess" for a wrong guess and
 * "Correct Guess" when the guess matches, then stop.
 *
 * TC: O(q), where q is the number of guesses until correct.
 * SC: O(1) auxiliary space.
 */

public class Guess {

    public static boolean guessDate(int guessedDate, int birthdayDate) {
        return guessedDate == birthdayDate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int birthdayDate = sc.nextInt();
        boolean hasGuessed = false;

        while (!hasGuessed) {
            int guessedDate = sc.nextInt();
            hasGuessed = guessDate(guessedDate, birthdayDate);

            if (hasGuessed) {
                System.out.println("Correct Guess");
            } else {
                System.out.println("Incorrect Guess");
            }
        }

        sc.close();
    }
}
