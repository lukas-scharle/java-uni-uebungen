package semester1.blatt05;

import java.util.Scanner;

public class Aufgabe03 {
    static void main() {
            Scanner sc = new Scanner(System.in);


            // Aufgabe 3 KANTENLÄNGE VOM DREIECK
            System.out.println("Bitte gebe die Kantenlänge a ein: ");
            double a = sc.nextDouble();

            System.out.println("Bitte gebe die Kantenlänge b ein: ");
            double b = sc.nextDouble();

            double aSqrt = Math.pow(a, 2);

            double bSqrt = Math.pow(b, 2);

            double abWurzel = Math.sqrt((aSqrt + bSqrt));

            System.out.printf("Die Kantenlänge c = %.2f%n",abWurzel);  // Die Zahl wird mit ("%.2f", wert) auf 2 nachkommastellen gerundet
            // und "%n" erzeugt einne Absatz
    }
}
