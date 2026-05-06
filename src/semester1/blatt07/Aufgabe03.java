package semester1.blatt07;

public class Aufgabe03 {
    static void main() {
        // AUFGABE 3
        double[] noten = {2.42, 5.1234, 1.073, 2.2125, 3.0, 1.34, 1.9987654};
        double sumNoten = 0;
        for (int i = 0; i < noten.length; i++) {
            sumNoten += noten[i];
        }
        double avg = sumNoten / noten.length;
        System.out.println(avg);
        System.out.printf("%.2f", avg);
        System.out.println(" ");
    }
}
