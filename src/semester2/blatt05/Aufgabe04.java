package semester2.blatt05;

public class Aufgabe04 {
    public static void inc(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]++;
            }
        }
    }
}
