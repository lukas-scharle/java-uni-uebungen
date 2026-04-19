import java.util.Scanner;

public class Aufgabe_2 {
    public static void draw(int n) {
        if (n % 2 == 0){
            System.out.println("""
                    Figur 1:
                    *****
                    *****
                    *****
                    *****
                    *****
                    Figur 2:
                    *
                    **
                    ***
                    ****
                    *****
                    """);
        } else {
            System.out.println("""
                    Figur 1:
                    *****
                    *****
                    *****
                    *****
                    *****
                    Figur 2:
                    *
                    **
                    ***
                    ****
                    *****
                    Figur 3:
                    *
                    ***
                    *****
                    """);
        }
    }

    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Zahl eingeben: ");
        int zahl = sc.nextInt();
        draw(zahl);
        sc.close();
    }
}
