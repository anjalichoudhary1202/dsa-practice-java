
/*
 * Problem: Weather
 *
 * Intuition:
 * Classify the weather based on temperature and humidity.
 *
 * Approach:
 * Temperature >= 30 means hot; otherwise, cool.
 * Humidity >= 90 determines whether it is humid.
 *
 * TC: O(1)
 * SC: O(1)
 */

public class Weather {

    public static void determineWeather(int temperature, int humidity) {
        if (temperature >= 30) {
            if (humidity >= 90) {
                System.out.println("Hot and Humid");
            } else {
                System.out.println("Hot");
            }
        } else {
            if (humidity >= 90) {
                System.out.println("Cool and Humid");
            } else {
                System.out.println("Cool");
            }
        }
    }

    public static void main(String[] args) {
        int temperature = 45;
        int humidity = 90;

        determineWeather(temperature, humidity);
    }
}
