package semester2.blatt01;

/**
 * Demonstriert Integer-Overflow und den Unterschied zwischen int- und
 * long-Rechnungen. Besonders wichtig ist das L-Suffix, damit die Multiplikation
 * bereits mit long statt int ausgefuehrt wird.
 */
public class Aufgabe06 {
    /**
     * Berechnet Mikro- und Millisekunden pro Tag und vergleicht die Werte.
     */
    public static void main(String[] args) {
//Mikrosekunden pro Tag
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000L;  // die Zahlen werde mit Int gerechnet un dann nin Long umgewandelt --> Overflow || Eine Zahl in der Rechnung mit L auf Long stellen
//Millisekunden pro Tag
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY);
        System.out.println(MILLIS_PER_DAY);
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
        System.out.println("done");
    }
}
