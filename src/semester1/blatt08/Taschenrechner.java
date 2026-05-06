package semester1.blatt08;

public class Taschenrechner {
    // Addition von zwei Zahlen
    public static double addiere(double a, double b) {
        return a + b;
    }

    // Subtraktion von zwei Zahlen
    public static double subtrahiere(double a, double b) {
        return a - b;
    }

    // Multiplikation von zwei Zahlen
    public static double multipliziere(double a, double b) {
        return a * b;
    }

    // Division von zwei Zahlen
    public static double teile(double a, double b) {
        if (istNull(b)) {
            System.out.println("Division durch 0 ist nicht erlaubt.");
            return Double.NaN;
        } else {
            System.out.println("Das Ergebnis der Division lautet: " + (a / b));
            return a / b;
        }

    }

    // Auf Division durch null prüfen
    public static boolean istNull(double x){
        if (x == 0){
            return true;
        } else {
            return false;
        }
    }

    // semester1.blatt08.Taschenrechner
    public static void taschenrechner(int a, int b) {
        System.out.println("Die Summe lautet: " + (addiere(a, b)));
        System.out.println("Die Differenz lautet: " + (subtrahiere(a, b)));
        System.out.println("Das Produkt lautet: " + (multipliziere(a, b)));
        teile(a, b);
    }
}
