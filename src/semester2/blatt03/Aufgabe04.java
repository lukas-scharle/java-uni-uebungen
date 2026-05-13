package semester2.blatt03;

import java.util.Random;

/**
 * Simuliert viele Wuerfelwuerfe und zaehlt die Haeufigkeiten der Augenzahlen.
 * Die Aufgabe zeigt Arrays, Zufallszahlen und statistische Auswertung.
 */
public class Aufgabe04 {

    /**
     * Zaehlt, wie oft die Zahlen 1 bis 6 im uebergebenen Array vorkommen.
     */
    public static void zählen(int[] a) {
        int einser = 0;
        int zweier = 0;
        int dreier = 0;
        int vierer = 0;
        int fünfer = 0;
        int sechser = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                einser++;
            } else if (a[i] == 2) {
                zweier++;
            } else if (a[i] == 3) {
                dreier++;
            } else if (a[i] == 4) {
                vierer++;
            } else if (a[i] == 5) {
                fünfer++;
            } else if (a[i] == 6) {
                sechser++;
            }
        }
        System.out.println("Es gibt " + einser + " Einsen.");
        System.out.println("Es gibt " + zweier + " Zweien.");
        System.out.println("Es gibt " + dreier + " Dreien.");
        System.out.println("Es gibt " + vierer + " Vieren.");
        System.out.println("Es gibt " + fünfer + " Fünfen.");
        System.out.println("Es gibt " + sechser + " Sechsen.");
    }

    /**
     * Erzeugt 10.000 Zufallswuerfe und wertet sie aus.
     */
    static void main() {
        Random random = new Random();
        int[] zufall = new int[10000];
        for (int i = 0; i < 10000; i++) {
            zufall[i] = random.nextInt(6) + 1;
        }
        zählen(zufall);
    }
}
