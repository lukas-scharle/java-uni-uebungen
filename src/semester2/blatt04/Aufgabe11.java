package semester2.blatt04;

import java.util.Arrays;

/**
 * Befuellt ein Array mit gleichen Werten. Die Aufgabe vergleicht eine manuelle
 * Schleife mit der kuerzeren Standardmethode {@link Arrays#fill(int[], int)}.
 */
public class Aufgabe11 {
    /**
     * Erstellt ein Array, fuellt es und gibt den Inhalt aus.
     */
    static void main() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 42;
        }
        // Oder kürzer
        Arrays.fill(array, 45);
        System.out.println(Arrays.toString(array));
    }
}
