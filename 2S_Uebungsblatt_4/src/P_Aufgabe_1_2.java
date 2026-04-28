public class P_Aufgabe_1_2 {

    public static int[] toEven(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                array[index++] = a[i];
            }
        }
        return array;
    }

    record ArrayRecord(int[] odd, int[] even) {
    }
    public static ArrayRecord splitToOddAndEven(int[] a) {
        if (a == null) {
            return null;
        }
        int[] odd = P_Aufgabe_1_1.toOdd(a);
        int[] even = toEven(a);

        return new ArrayRecord( odd, even);
    }
}
