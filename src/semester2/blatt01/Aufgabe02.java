package semester2.blatt01;

/**
 * Liest zwei ganze Zahlen ein und delegiert die Berechnung der Grundoperationen
 * an die Klasse {@link Methoden}. Dadurch wird Eingabelogik von Rechenlogik
 * getrennt.
 */
public class Aufgabe02 {
    /**
     * Fragt zwei Zahlen ab und startet die Berechnung.
     */
    void main() {
        IO.println("Aufgabe 2");
        Methoden.berechneErgebnisse(Methoden.readInt("Erste Zahl eingeben: "), Methoden.readInt("Zweite Zahl eingeben: "));
    }
}
