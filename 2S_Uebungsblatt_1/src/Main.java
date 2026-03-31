//TIP Zum <b>Ausführen</b> des Codes <shortcut actionId="Run"/> drücken oder
// Klicke auf das Symbol <icon src="AllIcons.Actions.Execute"/> in der Randleiste.

import Blatt1.Methoden;
void main() {
    // Aufgabe 1
    System.out.println("Aufgabe 1");
    for (int i = 0; i < 10; i++) {
        Methoden.druckeFiguren();
        System.out.println();
    }
    System.out.println("----------");

    // Aufgabe 2
    System.out.println("Aufgabe 2");
    Methoden.berechneAufgabe2(Methoden.readInt("Erste Zahl eingeben: "), Methoden.readInt("Zweite Zahl eingeben: "));
    System.out.println("----------");

}




