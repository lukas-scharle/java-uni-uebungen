package semester2.blatt04;

public class Aufgabe03 {
    public static long absLong(double a) {
        if (a < 0) {
            return (long) (-a);
        } else {
            return (long) a;
        }
    }

    static void main() {
        double a = -3242.654;
        System.out.println(absLong(a));
    }
}
