public class Aufgabe_3 {
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
