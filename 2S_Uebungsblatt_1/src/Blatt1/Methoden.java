package Blatt1;

import java.util.Scanner;

public class Methoden {



        private static final Scanner SCANNER = new Scanner(System.in);

        public static int readInt(String prompt) {
            while (true) {
                System.out.print(prompt);

                if (SCANNER.hasNextInt()) {
                    int value = SCANNER.nextInt();
                    SCANNER.nextLine(); // Rest der Zeile aufräumen
                    return value;
                } else {
                    System.out.println("Bitte eine gültige ganze Zahl eingeben.");
                    SCANNER.nextLine(); // falsche Eingabe verwerfen
                }
            }
        }

    // Zu Aufgabe 1
    public static void druckeFiguren() {
        System.out.println("**********       *    *******");
        System.out.println("*        *      ***    *****");
        System.out.println("*        *     *****    ***");
        System.out.println("**********    *******    *");
    }

    public static void berechneAufgabe2(int a, int b) {
        int sum = a + b;
        int dif = a - b;
        int pro = a * b;
        int quo = a / b;
        int rest = a % b;
        System.out.println("Summe = " +(a+b));
        System.out.println("Differenz = " + (a-b));
        System.out.println("Produkt = " +(a*b));
        if (b!=0){
            System.out.println("Quotient = " + (a/b));
            System.out.println("Rest = " + (a%b));
        }


    }


}
