public class Aufgabe_15 {
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
