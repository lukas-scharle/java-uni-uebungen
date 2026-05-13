package semester2.blatt04;

/**
 * Erweitert die Filteraufgabe um gerade Zahlen und eine gemeinsame Rueckgabe
 * fuer gerade und ungerade Werte. Die Klasse zeigt Methodenwiederverwendung und
 * Records als kompakte Datencontainer.
 */
public class ProgAufgabe01Teil2 {

    /**
     * Erstellt ein neues Array, das nur die geraden Werte aus a enthaelt.
     */
    public static int[] toEven(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                array[index++] = a[i];
            }
        }
        return array;
    }

    /**
     * Buendelt die getrennten Ergebnisse fuer ungerade und gerade Zahlen.
     */
    record ArrayRecord(int[] odd, int[] even) {
    }
    /**
     * Teilt ein Array in ungerade und gerade Werte auf.
     */
    public static ArrayRecord splitToOddAndEven(int[] a) {
        if (a == null) {
            return null;
        }
        int[] odd = ProgAufgabe01Teil1.toOdd(a);
        int[] even = toEven(a);

        return new ArrayRecord( odd, even);
    }
}
