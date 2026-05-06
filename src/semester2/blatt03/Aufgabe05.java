package semester2.blatt03;

import java.util.Random;

public class Aufgabe05 {
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

    static void main() {
        zaehlenBisSechs();
    }
}
