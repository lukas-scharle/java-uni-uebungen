package semester2.blatt04;

public class ProgAufgabe02 {


    public static int[] merge(int[] a1, int[] a2, int[] a3) {
        if (a1 == null || a2 == null || a3 == null) {
            return null;
        }
        int[] array = new int[a1.length + a2.length + a3.length];
        int max = Math.max(a1.length, Math.max(a2.length, a3.length));
        int arrayIndex = 0;
        for (int i = 0; i < max; i++) {
            if (a1 != null && i < a1.length) {
                array[arrayIndex] = a1[i];
                arrayIndex++;
            }
            if (a2 != null && i < a2.length) {
                array[arrayIndex] = a2[i];
                arrayIndex++;
            }
            if (a3 != null && i < a3.length) {
                array[arrayIndex] = a3[i];
                arrayIndex++;
            }
        }
        return array;
    }
}
