package semester1.blatt08;

public class Aufgabe03 {
    static void main() {
        // AUFGABE 3 - semester1.blatt08.Lotto
        int[] ergebnis = Lotto.zieheKaestchen();
        Lotto.tippAusgabe(ergebnis);
        int[][] schein = Lotto.zieheSchein();
        Lotto.scheinAusgabe(schein);
    }
}
