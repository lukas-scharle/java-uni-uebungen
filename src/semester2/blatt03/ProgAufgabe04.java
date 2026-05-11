package semester2.blatt03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgAufgabe04 {
    public static int[] dateiEinlesen(String dateiname) {
        int[] array = new int[20];
        int index = 0;

        try {
            File datei = new File(dateiname);
            Scanner sc = new Scanner(datei);

            while (sc.hasNextInt()) {
                array[index] = sc.nextInt();
                index++;
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Datei wurde nicht gefunden.");
        }
        return array;
    }

    static void main() {
        int[] array = dateiEinlesen("data.txt");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
