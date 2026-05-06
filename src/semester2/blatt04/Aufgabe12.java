package semester2.blatt04;

import java.util.Arrays;

public class Aufgabe12 {
    public static int[] create(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n darf nicht negativ sein");
        }
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = i + 1;
            }
            return array;

    }

    static void main() {
        System.out.println(Arrays.toString(create(23)));
    }
}
