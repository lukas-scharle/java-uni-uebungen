package semester2.blatt05;

import Util.AusgabeUtil;

/**
 * Erzeugt eine Einheitsmatrix. Die Aufgabe zeigt zweidimensionale Arrays und
 * das Setzen der Hauptdiagonale.
 */
public class Aufgabe02 {
    /**
     * Erstellt eine quadratische Matrix mit Einsen auf der Hauptdiagonale.
     */
    public static int[][] einheitsMatrix(int groeße) {
        int[][] matrix = new int[groeße][groeße];
        for (int i = 0; i < groeße; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    /**
     * Gibt eine Beispielmatrix mit der Ausgabe-Hilfsklasse aus.
     */
    static void main() {
        //Test
        AusgabeUtil.matrixAusgabe(einheitsMatrix(5));
    }
}
