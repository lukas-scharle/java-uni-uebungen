package semester1.blatt07;

import java.util.Scanner;

public class Aufgabe01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // AUFGABE 1
        int[] arrayZehn = new int[10];
        for (int i = 0; i < 10; i++) {
            int zahlen = i + 1;
            arrayZehn[i] = zahlen;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayZehn[i]);
        }
    }
}
