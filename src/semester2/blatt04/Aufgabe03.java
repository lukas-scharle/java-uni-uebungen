package semester2.blatt04;

/**
 * Wandelt den Betrag einer double-Zahl in einen long-Wert um. Die Aufgabe zeigt
 * Vorzeichenbehandlung und explizite Typumwandlung.
 */
public class Aufgabe03 {
    /**
     * Gibt den absoluten Wert als long zurueck; Nachkommastellen werden dabei
     * durch den Cast abgeschnitten.
     */
    public static long absLong(double a) {
        if (a < 0) {
            return (long) (-a);
        } else {
            return (long) a;
        }
    }

    /**
     * Testet die Betragsfunktion mit einem negativen Beispielwert.
     */
    static void main() {
        double a = -3242.654;
        System.out.println(absLong(a));
    }
}
