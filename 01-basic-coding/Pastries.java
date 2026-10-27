
/*
 * Problem: Pastries
 *
 * Intuition:
 * Customers are served one after another. As long as at least
 * one pastry remains when a customer arrives, they can be served.
 *
 * Approach:
 * Check whether pastries > 0 before serving each customer.
 * If true, subtract the customer's requested quantity and print
 * "Enjoy your dessert!".
 * Otherwise, print "Sorry, we are all out!".
 *
 * TC: O(q), where q is the number of customers.
 * SC: O(1) auxiliary space.
 */

public class Pastries {

    public static void printDistribution(int pastries, int n, int[] customers) {
        for (int i = 0; i < n; i++) {
            if (pastries > 0) {
                pastries = pastries - customers[i];
                System.out.println("Enjoy your dessert!");
            } else {
                System.out.println("Sorry, we are all out!");
            }
        }
    }

    public static void main(String[] args) {
        int pastries = 15;
        int n = 6;

        int[] customers = {3, 2, 7, 4, 2, 1};
        printDistribution(pastries, n, customers);
    }
}
