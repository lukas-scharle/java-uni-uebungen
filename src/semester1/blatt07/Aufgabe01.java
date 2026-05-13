package semester1.blatt07;

import java.util.Scanner;

/**
 * Erstellt ein eindimensionales Array, befuellt es mit den Zahlen 1 bis 10 und
 * gibt die Werte wieder aus. Damit werden Array-Erzeugung, Indexzugriff und
 * einfache for-Schleifen geuebt.
 */
public class Aufgabe01 {
    /**
     * Befuellt das Array schrittweise und iteriert danach zur Ausgabe darueber.
     */
    static void main() {
        Scanner sc = new Scanner(System.in);
        // AUFGABE 1
        int[] arrayZehn = new int[10];
        for (int i = 0; i < 10; i++) {
            int zahlen = i + 1;
            arrayZehn[i] = zahlen;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayZehn[i]);
        }
    }
}
