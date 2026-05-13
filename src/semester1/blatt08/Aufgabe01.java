package semester1.blatt08;

import java.util.Scanner;

/**
 * Einstiegspunkt fuer den ausgelagerten Taschenrechner. Diese Aufgabe zeigt,
 * wie eine eigene Hilfsklasse aufgerufen und dadurch Code wiederverwendet wird.
 */
public class Aufgabe01 {
    /**
     * Liest zwei Zahlen ein und uebergibt sie an die Taschenrechner-Klasse.
     */
    static void main() {
        // AUFGABE 1 - semester1.blatt08.Taschenrechner
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl a ein: ");
        int a = sc.nextInt();
        System.out.println("Bite gebe eine Zahl b ein: ");
        int b = sc.nextInt();
        Taschenrechner.taschenrechner(a, b);
        System.out.println("-----");
    }
}
