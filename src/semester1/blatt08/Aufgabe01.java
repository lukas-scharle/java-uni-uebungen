package semester1.blatt08;

import java.util.Scanner;

public class Aufgabe01 {
    static void main() {
        // AUFGABE 1 - semester1.blatt08.Taschenrechner
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl a ein: ");
        int a = sc.nextInt();
        System.out.println("Bite gebe eine Zahl b ein: ");
        int b = sc.nextInt();
        Taschenrechner.taschenrechner(a, b);
        System.out.println("-----");
    }
}
