package semester2.blatt03;

import java.util.Scanner;

/**
 * Gibt je nach gerader oder ungerader Eingabe unterschiedliche Textfiguren aus.
 * Die Aufgabe verbindet Verzweigungen mit mehrzeiligen Textbloecken.
 */
public class Aufgabe02 {
    /**
     * Zeichnet bei geraden Zahlen zwei und bei ungeraden Zahlen drei Figuren.
     */
    public static void draw(int n) {
        if (n % 2 == 0){
            System.out.println("""
                    Figur 1:
                    *****
                    *****
                    *****
                    *****
                    *****
                    Figur 2:
                    *
                    **
                    ***
                    ****
                    *****
                    """);
        } else {
            System.out.println("""
                    Figur 1:
                    *****
                    *****
                    *****
                    *****
                    *****
                    Figur 2:
                    *
                    **
                    ***
                    ****
                    *****
                    Figur 3:
                    *
                    ***
                    *****
                    """);
        }
    }

    /**
     * Liest eine Zahl ein und startet die Figuren-Ausgabe.
     */
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Zahl eingeben: ");
        int zahl = sc.nextInt();
        draw(zahl);
        sc.close();
    }
}
