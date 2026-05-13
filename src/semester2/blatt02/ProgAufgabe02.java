package semester2.blatt02;

import java.util.Scanner;

/**
 * Rechnet eingegebene 1-, 2- und 5-Cent-Muenzen in Euro und Cent um. Die
 * Aufgabe zeigt ganzzahlige Division und Modulo fuer Betragsaufteilung.
 */
public class ProgAufgabe02 {

    /**
     * Berechnet den Gesamtbetrag aus den uebergebenen Muenzen.
     */
    public static void geldZählen (int cent1, int cent2, int cent5){
        int summe = (cent1 + (cent2 * 2) + (cent5 * 5));
        int cent = summe % 100;
        int euro = summe / 100;
        System.out.println("Du hast " + euro + "€ und " + cent + " Cent eingegeben.");
    }

    /**
     * Fragt die Muenzenanzahl ab und gibt den Gesamtbetrag aus.
     */
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Wie viele 1 Cent Stücke hast du?");
        int cent1 = sc.nextInt();
        System.out.println("Wie viele 2 Cent Stücke hast du?");
        int cent2 = sc.nextInt();
        System.out.println("Wie viele 5 Cent Stücke hast du?");
        int cent5 = sc.nextInt();
        geldZählen(cent1, cent2, cent5);
    }

}
