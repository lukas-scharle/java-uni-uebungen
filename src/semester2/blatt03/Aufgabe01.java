package semester2.blatt03;

import java.util.Scanner;

/**
 * Rundet ganze Zahlen auf den naechsten Hunderter. Die Aufgabe zeigt
 * Modulo-Rechnung, Verzweigungen und die Rueckgabe eines berechneten Werts.
 */
public class Aufgabe01 {
    /**
     * Rundet n kaufmaennisch auf volle Hunderter.
     */
    public static int runde (int n) {
        if (n % 100 < 50) {
            n = n - (n % 100);
            return n;
        } else {
            n = n + (100 - (n % 100));
            return n;
        }
    }
    /**
     * Liest eine Zahl ein und gibt den gerundeten Wert aus.
     */
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Zahl eingeben: ");
        int zahl = sc.nextInt();
        System.out.println(runde(zahl));
        sc.close();
    }
}
