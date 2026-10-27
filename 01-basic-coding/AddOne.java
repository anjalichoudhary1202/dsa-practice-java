
/*
 * Problem: Add One
 *
 * Intuition:
 * The person's age next year will be their current age + 1.
 *
 * Approach:
 * Increment the age by 1 and print the formatted message.
 *
 * TC: O(1)
 * SC: O(1)
 */
public class AddOne {

    public static void printNameAndAge(String name, int age) {
        System.out.println(
            "Hello " + name + "! Next year, you will be "
            + (age + 1) + " years old"
        );
    }

    public static void main(String[] args) {
        printNameAndAge("Anjali", 26);
    }
}
