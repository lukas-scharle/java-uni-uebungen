package semester2.blatt03;

import java.util.Arrays;

/**
 * Befuellt ein Array automatisch mit den Zahlen 1 bis 100. Die Aufgabe zeigt
 * indexbasierte Initialisierung und Ausgabe kompletter Arrays.
 */
public class Aufgabe10 {
    /**
     * Schreibt an jeden Index den passenden Zaehlerwert.
     */
    static void main() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }
}
