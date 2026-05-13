package semester2.blatt03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Liest Ganzzahlen aus einer Datei in ein Array ein. Die Aufgabe zeigt einfache
 * Dateiverarbeitung, Scanner-Nutzung auf Dateien und Ausnahmebehandlung.
 */
public class ProgAufgabe04 {
    /**
     * Liest bis zu "anzahl" Integer-Werte aus der angegebenen Datei.
     *
     * @param dateiname Pfad oder Name der einzulesenden Datei
     * @return Array mit den gelesenen Werten
     */
    public static int[] dateiEinlesen(String dateiname) {
        int anzahl = 20;
        int[] array = new int[anzahl];
        int index = 0;

        try {
            File datei = new File(dateiname);
            Scanner sc = new Scanner(datei);

            while (sc.hasNextInt()) {
                array[index] = sc.nextInt();
                index++;
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Datei wurde nicht gefunden.");
        }
        return array;
    }

    /**
     * Liest die Datei data.txt ein und gibt alle Arraypositionen aus.
     */
    static void main() {
        int[] array = dateiEinlesen("data.txt");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
