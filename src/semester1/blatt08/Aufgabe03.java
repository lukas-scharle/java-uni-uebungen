package semester1.blatt08;

/**
 * Einstiegspunkt fuer die Lotto-Aufgabe. Die Klasse zeigt, wie Methoden fuer
 * Ziehung, Tippausgabe und Scheinausgabe zusammenspielen.
 */
public class Aufgabe03 {
    /**
     * Erzeugt eine einzelne Ziehung und anschliessend einen kompletten Tippschein.
     */
    static void main() {
        // AUFGABE 3 - semester1.blatt08.Lotto
        int[] ergebnis = Lotto.zieheKaestchen();
        Lotto.tippAusgabe(ergebnis);
        int[][] schein = Lotto.zieheSchein();
        Lotto.scheinAusgabe(schein);
    }
}
