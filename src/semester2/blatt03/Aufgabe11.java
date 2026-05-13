package semester2.blatt03;

/**
 * Summiert alle geraden Werte eines double-Arrays. Die Aufgabe zeigt
 * Arraydurchlauf, Bedingung und Rueckgabe eines akkumulierten Ergebnisses.
 */
public class Aufgabe11 {
    /**
     * Addiert alle Elemente, die ohne Rest durch 2 teilbar sind.
     */
    public static double positivSum(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
}
