package semester2.blatt05;

import Util.AusgabeUtil;

public class Aufgabe02 {
    public static int[][] einheitsMatrix(int groeße) {
        int[][] matrix = new int[groeße][groeße];
        for (int i = 0; i < groeße; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    static void main() {
        //Test
        AusgabeUtil.matrixAusgabe(einheitsMatrix(5));
    }
}
