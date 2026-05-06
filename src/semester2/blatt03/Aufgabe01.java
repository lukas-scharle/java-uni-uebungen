package semester2.blatt03;

import java.util.Scanner;

public class Aufgabe01 {
    public static int runde (int n) {
        if (n % 100 < 50) {
            n = n - (n % 100);
            return n;
        } else {
            n = n + (100 - (n % 100));
            return n;
        }
    }
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Zahl eingeben: ");
        int zahl = sc.nextInt();
        System.out.println(runde(zahl));
        sc.close();
    }
}
