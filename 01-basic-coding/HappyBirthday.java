
/*
 * Problem: Happy Birthday
 *
 * Intuition:
 * Calculate the person's age by subtracting their birth year
 * from the given current year.
 *
 * Approach:
 * Subtract birthYear from 2020 and print the birthday message.
 *
 * TC: O(1)
 * SC: O(1)
 */
public class HappyBirthday {

    public static void wishHappyBirthday(String name, int birthYear) {
        int currentAge = 2020 - birthYear;

        System.out.println(
            "Happy Birthday " + name
            + "! Your current age is " + currentAge
        );
    }

    public static void main(String[] args) {
        wishHappyBirthday("Anjali", 2000);
    }
}
