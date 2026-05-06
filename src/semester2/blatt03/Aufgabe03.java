package semester2.blatt03;

public class Aufgabe03 {
    public static void einMalEins (){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("");
        }
    }

    static void main() {
        einMalEins();
    }
}
