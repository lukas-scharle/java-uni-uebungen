package semester2.blatt02;

import java.util.Random;

public class Aufgabe24 {

    public static int zufallszahl() {
        Random random = new Random();
        return random.nextInt(49) + 1; // Bereichgröße 49 von 0-48; deswegen +1 um Bereich auf 1-49 zu ändern
    }

    void main() {
        System.out.println("Die Zufallszahl ist: " + zufallszahl());
    }
}