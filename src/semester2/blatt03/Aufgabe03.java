package semester2.blatt03;

/**
 * Gibt das kleine Einmaleins von 1 bis 10 aus. Die Aufgabe demonstriert
 * verschachtelte Schleifen.
 */
public class Aufgabe03 {
    /**
     * Durchlaeuft alle Kombinationen von Faktor 1 bis 10.
     */
    public static void einMalEins (){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("");
        }
    }

    /**
     * Startet die Ausgabe des Einmaleins.
     */
    static void main() {
        einMalEins();
    }
}
