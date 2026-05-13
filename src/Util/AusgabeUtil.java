package Util;

/**
 * Kleine Ausgabeklasse fuer zweidimensionale Arrays. Sie vermeidet doppelte
 * Matrix-Ausgabelogik in den einzelnen Aufgaben.
 */
public class AusgabeUtil {
    /**
     * Gibt eine int-Matrix zeilenweise auf der Konsole aus.
     */
    public static void matrixAusgabe(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Gibt eine double-Matrix zeilenweise auf der Konsole aus.
     */
    public static void matrixAusgabe(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
