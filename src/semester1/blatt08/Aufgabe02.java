package semester1.blatt08;

import java.util.Scanner;

public class Aufgabe02 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // AUFGABE 2 - semester1.blatt08.Schaltjahr prüfen
        System.out.println("Bitte gebe ein Jahr ein: ");
        int jahr = sc.nextInt();
        if (Schaltjahr.schaltjahr(jahr)) {
            System.out.println(jahr + " Ist ein semester1.blatt08.Schaltjahr!");
        } else {
            System.out.println(jahr + " Ist kein semester1.blatt08.Schaltjahr.");
        }
        System.out.println("-----");
    }
}
