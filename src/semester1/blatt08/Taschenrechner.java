package semester1.blatt08;

/**
 * Statische Hilfsklasse fuer einfache Rechenoperationen. Die Klasse zeigt
 * Methodenzerlegung, Rueckgabewerte und eine Schutzabfrage gegen Division durch
 * null.
 */
public class Taschenrechner {
    /**
     * Addiert zwei Zahlen.
     */
    public static double addiere(double a, double b) {
        return a + b;
    }

    /**
     * Subtrahiert die zweite Zahl von der ersten.
     */
    public static double subtrahiere(double a, double b) {
        return a - b;
    }

    /**
     * Multipliziert zwei Zahlen.
     */
    public static double multipliziere(double a, double b) {
        return a * b;
    }

    /**
     * Dividiert zwei Zahlen und gibt bei Division durch null NaN zurueck.
     */
    public static double teile(double a, double b) {
        if (istNull(b)) {
            System.out.println("Division durch 0 ist nicht erlaubt.");
            return Double.NaN;
        } else {
            System.out.println("Das Ergebnis der Division lautet: " + (a / b));
            return a / b;
        }

    }

    // Auf Division durch null pruefen
    /**
     * Prueft, ob ein Wert genau 0 ist.
     */
    public static boolean istNull(double x){
        if (x == 0){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Fuehrt alle vier Grundrechenarten aus und gibt die Ergebnisse aus.
     */
    public static void taschenrechner(int a, int b) {
        System.out.println("Die Summe lautet: " + (addiere(a, b)));
        System.out.println("Die Differenz lautet: " + (subtrahiere(a, b)));
        System.out.println("Das Produkt lautet: " + (multipliziere(a, b)));
        teile(a, b);
    }
}
