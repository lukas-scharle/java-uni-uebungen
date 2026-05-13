package semester2.blatt01;

/**
 * Bestimmt die kleinste von drei eingegebenen Zahlen. Die Aufgabe zeigt
 * verschachtelte Vergleiche und strukturierte Konsoleneingabe.
 */
public class Aufgabe05 {
    /**
     * Liest drei Zahlen ein und uebergibt sie an die Vergleichsmethode.
     */
    static void main() {
        System.out.println("Aufgabe 5");
        int zahl1 = Methoden.readInt("Erste Zahl eingeben:");
        int zahl2 = Methoden.readInt("Zweite Zahl eingeben: ");
        int zahl3 = Methoden.readInt("Dritte Zahl eingeben: ");
        Methoden.kleinsteZahl(zahl1, zahl2, zahl3);
    }
}
