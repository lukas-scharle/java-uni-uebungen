package semester2.blatt01;

/**
 * Prueft, ob eine von zwei Zahlen das Quadrat der anderen ist. Die Klasse zeigt
 * einfache Methodennutzung und boolesche Entscheidungen.
 */
public class Aufgabe03 {
    /**
     * Liest zwei Zahlen ein und uebergibt sie an die Pruefmethode.
     */
    void main() {
        System.out.println("Aufgabe 3");
        Methoden.pruefeQuadrat(Methoden.readInt("Erste Zahl eingeben: "), Methoden.readInt("Zweite Zahl eingeben: "));
    }
}

