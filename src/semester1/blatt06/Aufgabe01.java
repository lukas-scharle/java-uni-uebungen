package semester1.blatt06;

import java.util.Scanner;

public class Aufgabe01 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        // AUFGABE 1a
        System.out.println("1a");


        for (int i = 100; i > 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        // AUFGABE 1b
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1b");


        int a = 100;
        while (a >= 1) {
            if (a % 2 == 1) {
                System.out.print(a + " ");
            }
            a--;
        }


        // AUFGABE  1c
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1c");


        int count = 0;
        int gesamt = 0;
        while (count < 500) {
            int random = (int) (Math.random() * 1000) + 1;
            gesamt++;
            if (random == 500) {
                count++;
            }
        }
        System.out.println(gesamt);


        // AUFGABE 1d
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1d");
        int zahl;
        do {
            System.out.println("Bitte gebe eine Zahl ein: ");
            zahl = sc.nextInt();
            System.out.println("Deine Zahl ist");
            System.out.println(zahl);
        } while (zahl != 42);

    }
}
