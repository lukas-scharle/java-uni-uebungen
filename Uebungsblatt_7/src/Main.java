import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // AUFGABE 1
        int[] arrayZehn = new int[10];
        for (int i = 0; i < 10; i++) {
            int zahlen = i + 1;
            arrayZehn[i] = zahlen;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayZehn[i]);
        }

        // AUFGABE 2
        int[] beliebigesArray = {121, 324, 634, 23, 5};
        int sum = 0;
        for (int i = 0; i < beliebigesArray.length; i++) {
            sum += beliebigesArray[i];
        }
        System.out.println(sum);

        // AUFGABE 3
        double[] noten = {2.42, 5.1234, 1.073, 2.2125, 3.0, 1.34, 1.9987654};
        double sumNoten = 0;
        for (int i = 0; i < noten.length; i++) {
            sumNoten += noten[i];
        }
        double avg = sumNoten / noten.length;
        System.out.println(avg);
        System.out.printf("%.2f", avg);
        System.out.println(" ");

        // AUFGABE 4
        int[] maxMin = {123, 3123, 23, 1, 56, 456, 2, 456};
        int min = maxMin[0];
        int max = maxMin[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < (maxMin.length - 1); i++) {
            if (max < maxMin[i + 1]) {
                max = maxMin[i + 1];
            }
            if (min > maxMin[i + 1]) {
                min = maxMin[i + 1];
            }
        }
        System.out.println("Max ist: " + max);
        System.out.println("Min ist: " + min);
        System.out.println("Das Zweitgrößte ist: " + secondMax);

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

        //AUFGABE 6
        int [][] matrix = new int [3][4];
    }
}