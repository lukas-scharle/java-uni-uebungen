package semester2.blatt02;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Multipliziert sehr grosse Ganzzahlen mit {@link BigInteger}. Die Aufgabe
 * zeigt, wann normale primitive Datentypen nicht mehr ausreichen und wie Java
 * beliebig grosse Zahlen verarbeitet.
 */
public class ProgAufgabe01 {


    /**
     * Liest zwei beliebig grosse Zahlen als Text ein und multipliziert sie.
     */
    public static void beliebigeZahl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte erste Zahl eingeben: ");
        BigInteger ersteZahl = new BigInteger(sc.nextLine());
        System.out.println("Bitte zweite Zahl eingeben: ");
        BigInteger zweiteZahl = new BigInteger(sc.nextLine());
        System.out.println("Das Ergebnis ist " + ersteZahl.multiply(zweiteZahl));

    }

    /**
     * Testet BigInteger mit festen Werten und danach mit Benutzereingaben.
     */
    static void main() {
        BigInteger zahl1 = new BigInteger("1234567890987654321");
        BigInteger zahl2 = new BigInteger("34567890123456789");
        System.out.println(zahl1.multiply(zahl2));
        beliebigeZahl();
    }


}
