package semester2.blatt03;

import java.util.Random;

/**
 * Wuerfelt so lange, bis eine 6 faellt, und zaehlt die benoetigten Versuche.
 * Die Aufgabe demonstriert do-while-Schleifen und Zufallsexperimente.
 */
public class Aufgabe05 {
    /**
     * Fuehrt das Experiment einmal aus und gibt die Versuchszahl aus.
     */
    public static void zaehlenBisSechs() {
        Random random = new Random();
        int zaehler = 0;
        int zahl = 0;
        do {
            zahl = random.nextInt(6) + 1;
            zaehler++;
        } while (zahl != 6);
        System.out.println("Zähler bis zur Sechs: " +zaehler);
    }

    /**
     * Startet das Wuerfelexperiment.
     */
    static void main() {
        zaehlenBisSechs();
    }
}
