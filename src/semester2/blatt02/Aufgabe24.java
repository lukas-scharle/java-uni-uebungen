package semester2.blatt02;

import java.util.Random;

/**
 * Erzeugt eine Zufallszahl im Lotto-Bereich 1 bis 49. Die Aufgabe zeigt die
 * Nutzung von {@link Random} und die Anpassung des Wertebereichs.
 */
public class Aufgabe24 {

    /**
     * Liefert eine gleichverteilte Zufallszahl von 1 bis 49.
     */
    public static int zufallszahl() {
        Random random = new Random();
        return random.nextInt(49) + 1; // Bereichgröße 49 von 0-48; deswegen +1 um Bereich auf 1-49 zu ändern
    }

    /**
     * Gibt eine Beispielzufallszahl auf der Konsole aus.
     */
    void main() {
        System.out.println("Die Zufallszahl ist: " + zufallszahl());
    }
}
