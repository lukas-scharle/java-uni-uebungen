package semester2.blatt05;

/**
 * Erhoeht alle Werte einer Matrix direkt im uebergebenen Array. Die Aufgabe
 * zeigt Seiteneffekte bei Referenztypen.
 */
public class Aufgabe04 {
    /**
     * Inkrementiert jedes Matrixelement um 1.
     */
    public static void inc(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]++;
            }
        }
    }
}
