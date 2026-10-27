
import java.util.Scanner;

/*
 * Problem: Odd Even
 *
 * Intuition:
 * A number divisible by 2 is even; otherwise, it is odd.
 *
 * Approach:
 * Read each number and check its remainder when divided by 2.
 *
 * TC: O(n)
 * SC: O(1) auxiliary space
 */
public class OddEven {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            System.out.println(isEven(number) ? "EVEN" : "ODD");
        }

        sc.close();
    }
}
