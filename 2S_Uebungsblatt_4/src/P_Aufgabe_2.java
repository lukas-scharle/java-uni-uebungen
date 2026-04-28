public class P_Aufgabe_2 {

    public static int[] merge(int[] a1, int[] a2, int[] a3) {
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
