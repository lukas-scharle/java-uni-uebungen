package semester2.blatt03;

/**
 * Erzeugt eine Zahlenfolge, bei der jedes Element aus dem vorherigen Wert plus
 * Index entsteht, und gibt sie tabellarisch aus. Die Aufgabe zeigt Arrayaufbau
 * und formatierte Konsolenausgabe.
 */
public class ProgAufgabe01 {

    /**
     * Befuellt das Array mit der Folge und uebergibt es an die Ausgabe.
     */
    static void main() {
        int[] array = new int[100];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + i;
        }
        ausgeben(array);
    }

    /**
     * Gibt das Array in zehn Spalten pro Zeile aus.
     */
    public static void ausgeben(int[] a) {
        int index = 0;
        for (int i = 1; i <= 10; i++) {
            do {
                System.out.print(a[index] + "\t");
                index++;
            } while (index % 10 != 0);
            System.out.println();
        }

    }
}
