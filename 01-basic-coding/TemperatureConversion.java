
/*
 * Problem: Temperature Conversion
 *
 * Intuition:
 * Convert Celsius to Fahrenheit using the standard formula.
 *
 * Approach:
 * Multiply the temperature by 9/5 and add 32.
 *
 * TC: O(1)
 * SC: O(1)
 */

public class TemperatureConversion {

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 * celsius / 5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 34.52;

        System.out.printf("%.2f%n", celsiusToFahrenheit(celsius));
    }
}
