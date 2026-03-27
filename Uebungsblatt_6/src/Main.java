//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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


        // AUFGABE 2a
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("2a");
        int sum = 0;
        System.out.println("Bitte gebe die eine Zahl ein: ");
        int eingabe = sc.nextInt();
        int j =0;
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
        for (int i = 1; i <= teilbar; i++){
            if (i % 6 == 0){
                System.out.println(i);
            }
        }


        // AUFGABE 2c
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("2c");
        int quadrat = sc.nextInt();
        int k = 0;
        while (k <= quadrat){
            if ((k * k) <= quadrat){
                System.out.println(k*k);
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
