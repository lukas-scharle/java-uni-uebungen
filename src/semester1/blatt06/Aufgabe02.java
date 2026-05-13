package semester1.blatt06;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

/**
 * Uebungen zu Summenbildung, Teilbarkeit, Quadratzahlen und ersten
 * Kontrollstrukturen. Die Klasse zeigt, wie Eingaben mit Schleifen und
 * Bedingungen ausgewertet werden.
 */
public class Aufgabe02 {
    /**
     * Bearbeitet mehrere Teilaufgaben mit unterschiedlichen Schleifenmustern.
     */
    static void main() {
        Scanner sc = new Scanner(System.in);

        // AUFGABE 2a
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("2a");
        int sum = 0;
        System.out.println("Bitte gebe die eine Zahl ein: ");
        int eingabe = sc.nextInt();
        int j = 0;
        do {
            sum += j;
            j++;
        } while (j <= eingabe);
        System.out.println("Die Summe ist: " + sum);


        // AUFGABE 2b
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("2b");
        System.out.println("Gebe eien Zahl ein, um sie auf Teilbarkeit durch 6 zu prüfen");
        int teilbar = sc.nextInt();
        for (int i = 1; i <= teilbar; i++) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
        }


        // AUFGABE 2c
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("2c");
        int quadrat = sc.nextInt();
        int k = 0;
        while (k <= quadrat) {
            if ((k * k) <= quadrat) {
                System.out.println(k * k);
                k++;
            }
        }


        // AUFGABE 2d
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("2d");
        int prim = sc.nextInt();
    }

}
