import java.util.Arrays;

public class Aufgabe_11 {
    static void main() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = 42;
        }
        // Oder kürzer
        Arrays.fill(array, 42);
    }
}
