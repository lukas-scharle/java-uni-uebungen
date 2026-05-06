package semester1.blatt05;

import java.util.Scanner;

public class Aufgabe04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gebe eine Zahl x ein: ");
        double x = sc.nextDouble();

        System.out.println("Bitte gebe eien Zahl y ein: ");
        double y = sc.nextDouble();

        System.out.println("x+y = " + (x+y));
        System.out.println("x-y = " + (x-y));
        System.out.println("x*y = " + (x*y));
        System.out.println("x/y =" + (x/y));
    }
}
