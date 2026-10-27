
/*
 * Problem: Percentage
 *
 * Intuition:
 * Percentage is the total marks obtained divided by the
 * maximum possible marks, multiplied by 100.
 *
 * Approach:
 * Calculate the total marks obtained across all subjects.
 * Calculate the maximum possible marks as 80 * subjects.
 * Divide using double to preserve the fractional part,
 * then multiply by 100 to get the percentage.
 *
 * TC: O(n), where n is the number of subjects.
 * SC: O(1) auxiliary space.
 */

public class Percentage {

    public static double calculatePercentage(int subjects, int[] marks) {
        int totalMarks = 0;

        for (int i = 0; i < subjects; i++) {
            totalMarks += marks[i];
        }

        int maxMarks = 80 * subjects;

        return ((double) totalMarks / maxMarks) * 100;
    }

    public static void main(String[] args) {
        int subjects = 5;
        int[] marks = {77, 76, 68, 72, 79};

        System.out.println(calculatePercentage(subjects, marks));
    }
}
