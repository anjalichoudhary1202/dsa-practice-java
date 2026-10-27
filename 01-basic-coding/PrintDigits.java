
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Problem: Print Digits
 *
 * Intuition:
 * Modulo 10 gives the last digit, and dividing by 10
 * removes it. This extracts digits in reverse order.
 *
 * Approach:
 * Store each digit in a list, reverse the list, and
 * print the digits in their original order.
 *
 * TC: O(d)
 * SC: O(d)
 */
public class PrintDigits {

    public static void printDigitsRecursive(int number) {
      if (number < 10) {
          System.out.println(number);
          return;
      }

      printDigitsRecursive(number / 10);
      System.out.println(number % 10);
    }
    public static void extractDigits(int number, List<Integer> digits) {
        while (number > 0) {
            int lastDigit = number % 10;
            digits.add(lastDigit);
            number /= 10;
        }
    }

    public static void main(String[] args) {
        List<Integer> digits = new ArrayList<>();

        extractDigits(4765, digits);
        Collections.reverse(digits);

        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}
