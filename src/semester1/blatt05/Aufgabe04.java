package semester1.blatt05;

import java.util.Scanner;

/**
 * Einfacher Konsolenrechner fuer die vier Grundrechenarten. Die Aufgabe
 * demonstriert Benutzereingaben, arithmetische Operatoren und die direkte
 * Ausgabe berechneter Ausdruecke.
 */
public class Aufgabe04 {
    /**
     * Liest zwei Zahlen ein und berechnet Summe, Differenz, Produkt und Quotient.
     */
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl x ein: ");
        double x = sc.nextDouble();

        System.out.println("Bitte gebe eien Zahl y ein: ");
        double y = sc.nextDouble();

        System.out.println("x+y = " + (x+y));
        System.out.println("x-y = " + (x-y));
        System.out.println("x*y = " + (x*y));
        System.out.println("x/y =" + (x/y));
    }
}
