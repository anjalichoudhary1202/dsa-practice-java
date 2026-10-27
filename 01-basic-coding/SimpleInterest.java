
/*
 * Problem: Simple Interest
 *
 * Intuition:
 * Simple interest depends on the principal, annual rate,
 * and time. Multiply these values and divide by 100.
 *
 * Approach:
 * Use the formula: SI = (P * R * T) / 100.
 *
 * TC: O(1)
 * SC: O(1)
 */
public class SimpleInterest {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        double principal = 40;
        double rate = 10;
        double time = 10;

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println(simpleInterest);
    }
}
