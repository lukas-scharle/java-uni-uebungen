package semester2.blatt03;

/**
 * Prueft, ob alle Elemente eines Arrays auch in einem zweiten Array vorkommen.
 * Die Aufgabe zeigt verschachtelte Schleifen und eine einfache Mengenpruefung.
 */
public class Aufgabe17 {
    /**
     * Vergleicht jedes Element aus a mit allen Elementen aus b.
     */
    public static boolean istTeilmenge(int[] a, int[] b) {
        boolean treffer = true;
        for (int i = 0; i < a.length; i++) {
            treffer = false;
            for (int j = 0; j < b.length; j++) {
                if ((a[i] == b[j])) {
                    treffer = true;
                    break;
                }
            }
            if (treffer == false) {
                return false;
            }
        }
        return treffer;
    }
}


