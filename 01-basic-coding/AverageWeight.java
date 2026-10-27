
/*
 * Problem: Average Weight
 *
 * Intuition:
 * Add all the weights and divide their total by the number
 * of people to get the average weight.
 *
 * Approach:
 * Traverse the array once to calculate the sum, then divide
 * it by the number of weights.
 *
 * TC: O(n)
 * SC: O(1)
 */
public class AverageWeight {

    public static double calculateAverage(double[] weights) {
        double sum = 0.0;

        for (double weight : weights) {
            sum += weight;
        }

        return sum / weights.length;
    }

    public static void main(String[] args) {
        double[] weights = {
            40.75, 45.2, 55.3, 49.5, 43.3,
            54.1, 38.4, 63.8, 45.2, 58.25
        };

        System.out.printf("%.6f%n", calculateAverage(weights));
    }
}
