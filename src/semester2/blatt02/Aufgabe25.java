package semester2.blatt02;

public class Aufgabe25 {
    public static boolean unterWert (double a, double b) {
        if ((a - b) <= (-1000*1000)) {
            return true;
        } else {
            return false;
        }
    }

    static void main() {
        System.out.println(unterWert(12333, 12312332));
    }
}
