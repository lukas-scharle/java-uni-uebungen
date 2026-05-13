package semester1.blatt08;

/**
 * Kapselt die Regeln zur Schaltjahrberechnung. Die Methode zeigt verschachtelte
 * Bedingungen und die Reihenfolge wichtiger Sonderfaelle.
 */
public class Schaltjahr {
    /**
     * Prueft, ob ein Jahr nach den verwendeten Regeln ein Schaltjahr ist.
     *
     * @param jahr zu pruefendes Jahr
     * @return true, wenn das Jahr ein Schaltjahr ist
     */
    public static boolean schaltjahr(int jahr) {
        if (jahr < -45) {
            return false;
        } else if (jahr % 400 == 0) {
            return true;
        } else if (jahr % 100 == 0) {
            return false;
        } else if (jahr % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
