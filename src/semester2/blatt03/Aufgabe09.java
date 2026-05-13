package semester2.blatt03;

import java.util.Arrays;

/**
 * Erstellt ein int-Array mit 100 Plaetzen und setzt die ersten Werte manuell.
 * Die Ausgabe mit {@link Arrays#toString(int[])} macht den gesamten Inhalt
 * sichtbar.
 */
public class Aufgabe09 {
    /**
     * Demonstriert Standardwerte in Arrays und gezieltes Setzen einzelner Felder.
     */
    static void main() {
        int[] array = new int[100];
        array[0] = 1;
        array[1] = 2;
        System.out.println(Arrays.toString(array));
    }
}
