
/*
 * Problem: Milkman
 *
 * Intuition:
 * Calculate the milk container's volume, convert it to litres,
 * and multiply by the price per litre.
 *
 * Approach:
 * Use the cylinder formula: volume = 3.14 * r * r * h.
 * Divide by 1000 to convert cm³ to litres.
 *
 * TC: O(1)
 * SC: O(1)
 */
public class Milkman {

    public static double calculateAmount(int radius, int height, int pricePerLitre) {

        double volumeInCm3 = 3.14 * radius * radius * height;
        double volumeInLitres = volumeInCm3 / 1000.0;

        return pricePerLitre * volumeInLitres;
    }

    public static void main(String[] args) {
        int radius = 5;
        int height = 24;
        int pricePerLitre = 40;

        System.out.printf("%.2f%n", calculateAmount(radius, height, pricePerLitre));
    }
}
