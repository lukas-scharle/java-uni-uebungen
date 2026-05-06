package semester2.blatt02;

public class ProgAufgabe03 {

    public static void timeCalculator(int n) {
        int hour = n / 3600;
        int minute = (n % 3600) / 60;
        int sec = n % 60;
        System.out.println(n + " Sekunden entsprechen " + hour + " Stunden, " + minute + " Minuten und " + sec + " Sekunden.");
    }

    //test
    static void main() {
        timeCalculator(521);
    }

}
