package semester1.blatt07;

import java.util.Scanner;

/**
 * Sucht einen Namen in einem String-Array. Die Aufgabe zeigt String-Vergleiche,
 * case-insensitive Suche und das gezielte Beenden einer Schleife mit break.
 */
public class Aufgabe05 {
    /**
     * Liest den Suchbegriff ein und prueft ihn gegen alle bekannten Namen.
     */
    static void main() {
        Scanner sc = new Scanner(System.in);

        // AUFGABE 5
        String[] namen = {"Lukas", "Peter", "Paul", "Maximilian", "Detlef"};
        System.out.println("Gebe den gesuchten Namen ein: ");
        String eingabe = sc.nextLine();
        for (int i = 0; i < namen.length; i++) {
            if (eingabe.equalsIgnoreCase(namen[i])) {
                System.out.println("Der Name " + namen[i] + " ist dabei!");
                break;
            } else if (i == (namen.length - 1) && !eingabe.equalsIgnoreCase(namen[(namen.length - 1)])) {
                System.out.println("Der gesuchte Name ist nicht dabei");
            }
        }
    }
}
