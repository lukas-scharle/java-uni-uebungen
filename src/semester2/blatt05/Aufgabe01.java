package semester2.blatt05;

public class Aufgabe01 {
    public static int[][] clone(int[][] a) {
        int array[][] = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i].clone();
        }
        return array;
    }
}
