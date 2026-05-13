package semester2.blatt02;

/**
 * Prueft, ob die Differenz zweier Werte eine vorgegebene Untergrenze
 * unterschreitet. Die Aufgabe demonstriert boolesche Rueckgabewerte und
 * einfache Vergleichslogik.
 */
public class Aufgabe25 {
    /**
     * Gibt true zurueck, wenn a mindestens eine Million kleiner als b ist.
     */
    public static boolean unterWert (double a, double b) {
        if ((a - b) <= (-1000*1000)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Fuehrt einen kurzen Test der Vergleichsmethode aus.
     */
    static void main() {
        System.out.println(unterWert(12333, 12312332));
    }
}
