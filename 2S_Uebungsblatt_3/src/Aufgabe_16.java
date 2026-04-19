public class Aufgabe_16 {
    public static int[] berechneQuadratTab(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (i+1) * (i+1);
        }
        return array;
    }

}
