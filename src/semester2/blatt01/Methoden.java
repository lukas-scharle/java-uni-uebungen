package semester2.blatt01;

import java.util.Scanner;

/**
 * Zentrale Hilfsklasse fuer mehrere Aufgaben des ersten Blatts im zweiten
 * Semester. Sie buendelt robuste Konsoleneingabe, Rechenoperationen,
 * Quadratpruefung, Temperaturumrechnung und Zahlenvergleiche.
 */
public class Methoden {


    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Liest eine ganze Zahl robust ein und wiederholt die Abfrage bei
     * ungueltiger Eingabe.
     *
     * @param prompt Text, der vor der Eingabe angezeigt wird
     * @return gueltige Ganzzahl aus der Konsole
     */
    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (SCANNER.hasNextInt()) {
                int value = SCANNER.nextInt();
                SCANNER.nextLine(); // Rest der Zeile aufräumen
                return value;
            } else {
                System.out.println("Bitte eine gültige ganze Zahl eingeben.");
                SCANNER.nextLine(); // falsche Eingabe verwerfen
            }
        }
    }

    /**
     * Gibt mehrere einfache ASCII-Figuren aus.
     */
    public static void druckeFiguren() {
        System.out.println("**********       *    *******");
        System.out.println("*        *      ***    *****");
        System.out.println("*        *     *****    ***");
        System.out.println("**********    *******    *");
    }

    /**
     * Berechnet Grundrechenarten fuer zwei ganze Zahlen und behandelt Division
     * durch null separat.
     */
    public static void berechneErgebnisse(int a, int b) {
        System.out.println("Summe = " + (a + b));
        System.out.println("Differenz = " + (a - b));
        System.out.println("Produkt = " + (a * b));
        if (b != 0) {
            System.out.println("Ganzzahliger Quotient = " + (a / b));
            // Für Mathematisch korrekten Rest nach: a % b = a / b + r | r = 0 <= r < |b|
            System.out.println("Rest = " + (Math.floorMod(a, Math.abs(b)))); // Rundet ab und nicht gegen 0 bei negativen Zahlen // Math.abs gibt Zahl ohne Vorzeichen an
        } else {
            System.out.println("Division durch 0 nicht möglich!");
            System.out.println("Rest bei Division durch 0 nicht möglich!");

        }
    }

    /**
     * Prueft, ob eine der Zahlen die Quadratwurzel der jeweils anderen ist.
     */
    public static void pruefeQuadrat(int a, int b) {
        if (a * a == b) {
            System.out.println(a + " ist die Wurzel aus " + b);
        }
        if (b * b == a) {
            System.out.println(b + " ist die Wurzel aus " + a);
        } else {
            System.out.println("Keine der Zahlen entspricht dem Quadrat der anderen.");
        }
    }

    /**
     * Liest eine Temperatureinheit ein und normalisiert die Benutzereingabe.
     *
     * @return true fuer Grad Celsius, false fuer Fahrenheit
     */
    public static boolean ermittelEinheit(String prompt) {
        System.out.println(prompt);
        while (true) {
            String eingabe = SCANNER.nextLine();
            String cleanEingabe = eingabe.toLowerCase().replaceAll("[^a-z0-9]", "");
            if (cleanEingabe.equals("grad")) {
                return true;
            }
            if (cleanEingabe.equals("fahrenheit")) {
                return false;
            }
            System.out.println("Bitte eine gültige Einheit eingeben (Fahrenheit / Grad): ");
        }
    }

    /**
     * Liest einen double-Wert fuer die Temperaturumrechnung ein.
     */
    public static double ermittelWert(String prompt) {
        System.out.println(prompt);
        double d = SCANNER.nextDouble();
        return d;
    }

    /**
     * Rechnet Celsius in Fahrenheit oder Fahrenheit in Celsius um.
     *
     * @param b true, wenn der eingegebene Wert Grad Celsius ist
     * @param d Temperaturwert
     */
    public static void umwandelTemp(boolean b, double d) {
        if (b) {
            System.out.println("Die eingegebenen " + d + " Grad entsprechen " + (d * (9 / 5) + 32) + " Fahrenheit");
        } else {
            System.out.println("Die eingegebenen " + d + " Fahrenheit entsprechen " + (((5 * d) - 32) / 9) + " Grad");
        }
    }

    /**
     * Gibt die kleinste von drei Zahlen aus.
     */
    public static void kleinsteZahl(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                System.out.println("Die kleinste Zahl ist " + a);
            } else {
                System.out.println("Die kleinste Zahl ist " + c);
            }
        } else if (b < c) {
            System.out.println("Die kleinste Zahl ist " + b);
        } else {
            System.out.println("Die kleinste Zahl ist " + c);
        }
    }


}


