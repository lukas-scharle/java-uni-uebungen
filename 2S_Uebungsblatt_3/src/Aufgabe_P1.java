import java.util.Arrays;

public class Aufgabe_P1 {

    static void main() {
        int[] array = new int[100];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + i;
        }
        ausgeben(array);
    }

    public static void ausgeben(int[] a) {
        int index = 0;
        for (int i = 1; i <= 10; i++) {
            do {
                System.out.print(a[index] + "\t");
                index++;
            } while (index % 10 != 0);
            System.out.println();
        }

    }
}
