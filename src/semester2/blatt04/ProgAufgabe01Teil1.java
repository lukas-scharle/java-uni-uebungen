package semester2.blatt04;

public class ProgAufgabe01Teil1 {

    public static int[] toOdd(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                array[index++] = a[i];
            }
        }
        return array;
    }
}
