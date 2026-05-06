package semester1.blatt08;

import java.util.Arrays;

public class Lotto {
    // Ziehung
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

    // Überprüfen ob Zahl schon vergeben wurde
    public static boolean bereitsVorhanden(int[] ziehung, int tipp) {
        for (int element : ziehung) {
            if (element == tipp) {
                return true;
            }
        }
        return false;
    }

    // Ausgabe des Kästchen
    public static void tippAusgabe(int[] ziehung) {
        System.out.println("Ziehung: " + (Arrays.toString(ziehung)));
    }

    // Erstellen eines Scheines
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
    public static void scheinAusgabe(int[][] schein) {
        System.out.println("Der Schein lautet: " + Arrays.deepToString(schein));
    }
}


