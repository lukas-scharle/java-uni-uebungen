package semester1.blatt08;

import java.util.Arrays;

/**
 * Hilfsklasse fuer eine einfache Lotto-Simulation. Sie erzeugt Zufallszahlen,
 * verhindert doppelte Treffer innerhalb eines Kaestchens und formatiert die
 * Ausgabe fuer einzelne Tipps sowie ganze Scheine.
 */
public class Lotto {
    // Ziehung
    /**
     * Zieht sechs Zahlen im Bereich von 1 bis 49 fuer ein Lotto-Kaestchen.
     *
     * @return Array mit sechs gezogenen Zahlen
     */
    public static int[] zieheKaestchen() {
        int[] ziehung = new int[6];
        int zahl;
        for (int i = 0; i < ziehung.length; i++) {
            zahl = (int) (Math.random() * 49);
            zahl++;
            if (bereitsVorhanden(ziehung, zahl)) {
                zahl = (int) (Math.random() * 49);
                zahl++;
            }
            ziehung[i] = zahl;
        }
        return ziehung;
    }

    // Ueberpruefen, ob Zahl schon vergeben wurde
    /**
     * Prueft, ob eine Zahl im aktuellen Tipp bereits vorhanden ist.
     *
     * @param ziehung bisherige Zahlen des Tipps
     * @param tipp zu pruefende Zahl
     * @return true, wenn die Zahl schon im Array steht
     */
    public static boolean bereitsVorhanden(int[] ziehung, int tipp) {
        for (int element : ziehung) {
            if (element == tipp) {
                return true;
            }
        }
        return false;
    }

    // Ausgabe des Kaestchens
    /**
     * Gibt ein einzelnes Lotto-Kaestchen als Array aus.
     *
     * @param ziehung gezogene Zahlen
     */
    public static void tippAusgabe(int[] ziehung) {
        System.out.println("Ziehung: " + (Arrays.toString(ziehung)));
    }

    // Erstellen eines Scheines
    /**
     * Erzeugt einen Tippschein mit 12 Kaestchen und je 6 Zahlen.
     *
     * @return zweidimensionales Array mit allen Tipps
     */
    public static int[][] zieheSchein() {
        int[][] schein = new int[12][6];
        for (int i = 0; i < schein.length; i++) {
            int[] ziehung = zieheKaestchen();
            for (int j = 0; j < ziehung.length; j++) {
                int eingabe = ziehung[j];
                schein[i][j] = eingabe;
            }
        }
        return schein;
    }

    // Ausgabe des Scheines
    /**
     * Gibt den gesamten Tippschein mit {@link Arrays#deepToString(Object[])} aus.
     *
     * @param schein zweidimensionales Array mit Lotto-Tipps
     */
    public static void scheinAusgabe(int[][] schein) {
        System.out.println("Der Schein lautet: " + Arrays.deepToString(schein));
    }
}


