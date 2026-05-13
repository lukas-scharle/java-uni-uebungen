package semester2.blatt04;

import java.util.Arrays;

/**
 * Erzeugt ein Array mit den Zahlen 1 bis n. Die Aufgabe zeigt
 * Parametervalidierung, Fehlerbehandlung mit Exceptions und Arraybefuellung.
 */
public class Aufgabe12 {
    /**
     * Erstellt ein aufsteigend befuelltes Array.
     *
     * @param n Anzahl der Elemente; muss nicht negativ sein
     * @return Array mit den Werten 1 bis n
     */
    public static int[] create(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n darf nicht negativ sein");
        }
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = i + 1;
            }
            return array;

    }

    /**
     * Gibt ein Beispielarray aus.
     */
    static void main() {
        System.out.println(Arrays.toString(create(23)));
    }
}
