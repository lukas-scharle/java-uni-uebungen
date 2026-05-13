package semester2.blatt01;

/**
 * Startklasse fuer die Figuren-Ausgabe aus der Methoden-Hilfsklasse. Die
 * Aufgabe zeigt, wie wiederverwendbare Methoden mehrfach per Schleife
 * aufgerufen werden.
 */
public class Aufgabe01 {
    /**
     * Gibt die vorgegebene Figur zehnmal aus.
     */
    void main() {
        System.out.println("Aufgabe 1");
        for (int i = 0; i < 10; i++) {
            Methoden.druckeFiguren();
        }
    }
}



