package semester2.blatt05;

/**
 * Erstellt eine tiefe Kopie eines zweidimensionalen int-Arrays. Die Aufgabe
 * zeigt, warum bei verschachtelten Arrays jede Zeile separat kopiert werden
 * muss.
 */
public class Aufgabe01 {
    /**
     * Kopiert die aeussere Arraystruktur und alle inneren Zeilenarrays.
     */
    public static int[][] clone(int[][] a) {
        int array[][] = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i].clone();
        }
        return array;
    }
}
