package semester1.blatt07;

public class Aufgabe04 {
    static void main() {
        // AUFGABE 4
        int[] maxMin = {123, 3123, 23, 1, 56, 456, 2, 456};
        int min = maxMin[0];
        int max = maxMin[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < (maxMin.length - 1); i++) {
            if (max < maxMin[i + 1]) {
                max = maxMin[i + 1];
            }
            if (min > maxMin[i + 1]) {
                min = maxMin[i + 1];
            }
        }
        System.out.println("Max ist: " + max);
        System.out.println("Min ist: " + min);
        System.out.println("Das Zweitgrößte ist: " + secondMax);
    }
}
