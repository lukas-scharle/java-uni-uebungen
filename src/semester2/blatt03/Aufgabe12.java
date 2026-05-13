package semester2.blatt03;

/**
 * Erzeugt eine Tabelle der Quadratzahlen von 1 bis n. Die Aufgabe zeigt, wie
 * berechnete Werte in einem neu erzeugten Array gespeichert werden.
 */
public class Aufgabe12 {
    /**
     * Erstellt ein Array mit n Quadratzahlen.
     */
    public static int[] berechneQuadratTab(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (i+1) * (i+1);
        }
        return array;
    }

}
