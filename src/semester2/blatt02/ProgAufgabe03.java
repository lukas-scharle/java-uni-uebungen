package semester2.blatt02;

/**
 * Wandelt eine Sekundenzahl in Stunden, Minuten und Sekunden um. Die Aufgabe
 * trainiert ganzzahlige Division und Restbildung mit dem Modulo-Operator.
 */
public class ProgAufgabe03 {

    /**
     * Zerlegt Sekunden in die groesseren Zeiteinheiten.
     */
    public static void timeCalculator(int n) {
        int hour = n / 3600;
        int minute = (n % 3600) / 60;
        int sec = n % 60;
        System.out.println(n + " Sekunden entsprechen " + hour + " Stunden, " + minute + " Minuten und " + sec + " Sekunden.");
    }

    /**
     * Fuehrt einen Beispielaufruf der Zeitumrechnung aus.
     */
    static void main() {
        timeCalculator(521);
    }

}
