package semester2.blatt04;

/**
 * Filtert ungerade Zahlen aus einem Array heraus. Die Aufgabe zeigt ein
 * zweiphasiges Vorgehen: erst passende Elemente zaehlen, dann ein exakt grosses
 * Ergebnisarray befuellen.
 */
public class ProgAufgabe01Teil1 {

    /**
     * Erstellt ein neues Array, das nur die ungeraden Werte aus a enthaelt.
     */
    public static int[] toOdd(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                array[index++] = a[i];
            }
        }
        return array;
    }
}
