import java.util.Locale;
import java.util.Scanner;

public class Methoden {


    private static final Scanner SCANNER = new Scanner(System.in);

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

    // Zu Aufgabe 1
    public static void druckeFiguren() {
        System.out.println("**********       *    *******");
        System.out.println("*        *      ***    *****");
        System.out.println("*        *     *****    ***");
        System.out.println("**********    *******    *");
    }

    // Zu Aufgabe 2

    public static void berechneAufgabe2(int a, int b) {
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

    // Zu Aufgabe 3

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

    // Zu Aufgabe 4

    public static boolean ermittelEinheit(String prompt) {
        System.out.println(prompt);
        while (true) {
            String eingabe = SCANNER.nextLine();
            String cleanEingabe = eingabe
                    .toLowerCase()
                    .replaceAll("[^a-z0-9]", "");
            if (cleanEingabe.equals("grad")) {
                return true;
            }
            if (cleanEingabe.equals("fahrenheit")) {
                return false;
            }
            System.out.println("Bitte eine gültige Einheit eingeben (Fahrenheit / Grad): ");
        }
    }

    public static double ermittelWert (String prompt) {
        System.out.println(prompt);
        double d = SCANNER.nextDouble();
        return d;
    }

    public static void umwandelTemp(boolean b, double d) {
        if (b) {
            System.out.println("Die eingegebenen " + d + " Grad entsprechen " + (d * (9/5) + 32) + " Fahrenheit");
        } else {
            System.out.println("Die eingegebenen " + d + " Fahrenheit entsprechen " + (((5*d)-32)/9) + " Grad");
        }
    }

}


