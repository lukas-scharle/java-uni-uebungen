package semester2.blatt01;

/**
 * Startklasse fuer die Temperaturumrechnung. Die Eingabe der Einheit und des
 * Werts wird an Hilfsmethoden ausgelagert.
 */
public class Aufgabe04 {
    /**
     * Ermittelt Einheit und Wert und startet die Umrechnung.
     */
    static void main() {
        Methoden.umwandelTemp(Methoden.ermittelEinheit("Bitte gebe die Einheit ein, die du umwandeln möchtest (Grad / Fahrenheit): "), Methoden.ermittelWert("Gebe den Wert ein: "));
    }
}
