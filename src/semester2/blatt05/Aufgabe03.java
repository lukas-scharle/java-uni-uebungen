package semester2.blatt05;

/**
 * Gibt ein zweidimensionales Array zeilenweise aus. Die Aufgabe uebt
 * verschachtelte Schleifen fuer Matrixstrukturen.
 */
public class Aufgabe03 {
    /**
     * Durchlaeuft jede Zeile und jede Spalte des Arrays.
     */
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
