import java.util.Scanner;

//TIP Zum <b>Ausführen</b> des Codes <shortcut actionId="Run"/> drücken oder
// Klicke auf das Symbol <icon src="AllIcons.Actions.Execute"/> in der Randleiste.
public class Main {
    public static void main(String[] args) {
// AUFGABE 1 - Taschenrechner
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl a ein: ");
        int a = sc.nextInt();
        System.out.println("Bite gebe eine Zahl b ein: ");
        int b = sc.nextInt();
        Taschenrechner.taschenrechner(a, b);
        System.out.println("-----");

        // AUFGABE 2 - Schaltjahr prüfen
        System.out.println("Bitte gebe ein Jahr ein: ");
        int jahr = sc.nextInt();
        if (Schaltjahr.schaltjahr(jahr)) {
            System.out.println(jahr + " Ist ein Schaltjahr!");
        } else {
            System.out.println(jahr + " Ist kein Schaltjahr.");
        }
        System.out.println("-----");

        // AUFGABE 3 - Lotto
        int[] ergebnis = Lotto.zieheKaestchen();
        Lotto.tippAusgabe(ergebnis);
        int[][] schein = Lotto.zieheSchein();
        Lotto.scheinAusgabe(schein);
    }
}