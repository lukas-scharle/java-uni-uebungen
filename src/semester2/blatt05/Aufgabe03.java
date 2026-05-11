package semester2.blatt05;

public class Aufgabe03 {
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
