package Util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Wiederverwendbare Eingabe-Hilfsklasse fuer Konsolenprogramme. Die Methoden
 * lesen verschiedene Datentypen ein, validieren fehlerhafte Eingaben und fragen
 * so lange erneut nach, bis ein passender Wert eingegeben wurde.
 */
public class ReadUtil {
    // Ein gemeinsamer Scanner verhindert, dass mehrere Scanner auf System.in
    // gegeneinander arbeiten.
    static Scanner sIn = new Scanner(System.in);

    /**
     * Liest eine Ganzzahl (int) von der Konsole ein. Der Benutzer wird so lange
     * zur Eingabe aufgefordert, bis eine gültige Ganzzahl eingegeben wurde.
     *
     * @param prompt Text, der dem Benutzer als Aufforderung angezeigt wird
     * @return die eingegebene Ganzzahl
     */
    public static int nextInt(String prompt) {
        return nextInt(prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * Liest eine positive Ganzzahl (inklusive 0) von der Eingabe.
     *
     * @param prompt Der Text, der dem Benutzer angezeigt wird
     * (Eingabeaufforderung).
     * @return Eine Ganzzahl im Bereich von 0 bis Integer.MAX_VALUE.
     */
    public static int nextPosInt(String prompt) {
        // Ruft die Methode nextInt auf und beschränkt den Wertebereich
        // auf positive Zahlen (0 bis maximaler Integer-Wert)
        return nextInt(prompt, 0, Integer.MAX_VALUE);
    }

    /**
     * Liest eine Ganzzahl (int) von der Konsole ein, die innerhalb eines
     * vorgegebenen Wertebereichs liegen muss.
     *
     * Der Benutzer wird mit dem übergebenen Prompt zur Eingabe aufgefordert.
     * Die Eingabe wird zunächst als String gelesen und anschließend in eine
     * Ganzzahl umgewandelt.
     *
     * Ist die Eingabe keine gültige Ganzzahl oder liegt sie außerhalb des
     * erlaubten Bereichs [min, max], wird eine Fehlermeldung ausgegeben und der
     * Benutzer erneut zur Eingabe aufgefordert. Dieser Vorgang wiederholt sich,
     * bis eine gültige Zahl eingegeben wurde.
     *
     * @param prompt Text, der dem Benutzer als Eingabeaufforderung angezeigt
     * wird
     * @param min untere Grenze des erlaubten Wertebereichs (inklusive)
     * @param max obere Grenze des erlaubten Wertebereichs (inklusive)
     * @return die eingegebene Ganzzahl im Bereich [min, max]
     * @throws IllegalArgumentException wenn min größer als max ist
     */
    public static int nextInt(String prompt, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min " + min + " ist größer als " + max);
        }

        String s; // Speichert die Benutzereingabe als String

        // Schleife läuft so lange, bis eine gültige Eingabe erfolgt
        while (true) {
            System.out.println(prompt); // Ausgabe der Eingabeaufforderung
            s = sIn.next(); // Einlesen der Eingabe

            try {
                // Versuch, die Eingabe in eine Ganzzahl umzuwandeln
                int ret = Integer.parseInt(s);

                // Überprüfung, ob der Wert im erlaubten Bereich liegt
                if (ret >= min && ret <= max) {
                    return ret; // gültige Eingabe → Rückgabe
                } else {
                    System.out.println("Die Zahl muss zwischen " + min + " und " + max + " (einschließlich) liegen.");
                }

            } catch (NumberFormatException ex) {
                // Fehler, falls keine gültige Ganzzahl eingegeben wurde
                System.out.println("Ihre Eingabe " + s + " war fehlerhaft. Bitte eine Zahl zwischen " + min + " und "
                        + max + " eingeben.");
            }
        }
    }

    /**
     * Liest einen float-Wert von der Konsole ein.
     *
     * Die Methode fordert den Benutzer mit dem übergebenen Text (prompt) zur
     * Eingabe auf und liest die Eingabe zunächst als String ein. Anschließend
     * wird versucht, diesen String in einen float-Wert umzuwandeln.
     *
     * Falls die Eingabe keine gültige Fließkommazahl ist (z. B. Buchstaben),
     * wird eine Fehlermeldung ausgegeben und der Benutzer erneut zur Eingabe
     * aufgefordert. Dieser Vorgang wiederholt sich so lange, bis eine gültige
     * Eingabe erfolgt.
     *
     * Hinweis: Für Dezimalzahlen muss der Punkt (.) als Trennzeichen verwendet
     * werden, z. B. 3.14 statt 3,14.
     *
     * @param prompt Text, der dem Benutzer als Eingabeaufforderung angezeigt
     * wird
     * @return der eingegebene float-Wert
     */
    public static float nextFloat(String prompt) {
        String s; // Speichert die rohe Benutzereingabe als Zeichenkette

        // Endlosschleife: läuft so lange, bis eine gültige Zahl eingegeben
        // wurde
        while (true) {
            System.out.println(prompt); // Ausgabe der Eingabeaufforderung

            s = sIn.next(); // Einlesen der nächsten Eingabe (als String)

            try {
                // Versuch, die Eingabe in einen float-Wert umzuwandeln
                return Float.parseFloat(s);
            } catch (NumberFormatException ex) {
                // Ausnahme tritt auf, wenn die Eingabe keine gültige
                // Fließkommazahl ist

                System.out.println("Ihre Eingabe " + s
                        + " war fehlerhaft.\nBitte eine gültige Fließkommazahl eingeben (z.B. 3.14)");
            }
        }
    }

    /**
     * Liest einen double-Wert von der Konsole ein.
     */
    public static double nextDouble(String prompt) {
        String s;
        while (true) {
            System.out.println(prompt);
            s = sIn.next();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException ex) {
                System.out.println("Ihre Eingabe " + s
                        + " war fehlerhaft. Bitte eine gültige Fließkommazahl eingeben (z.B. 3.14)");
            }
        }
    }

    /**
     * Liest einen long-Wert von der Konsole ein.
     */
    public static long nextLong(String prompt) {
        String s;
        while (true) {
            System.out.println(prompt);
            s = sIn.next();
            try {
                return Long.parseLong(s);
            } catch (NumberFormatException ex) {
                System.out.println("Ihre Eingabe " + s + " war fehlerhaft. Bitte eine ganze Zahl zwischen "
                        + Long.MIN_VALUE + " und " + Long.MAX_VALUE + " eingeben.");
            }
        }
    }

    /**
     * Liest genau ein Zeichen (char) von der Konsole ein.
     *
     * Der Benutzer wird zur Eingabe aufgefordert. Es wird geprüft, ob genau ein
     * Zeichen eingegeben wurde. Falls die Eingabe leer ist oder mehr als ein
     * Zeichen enthält, wird eine Fehlermeldung ausgegeben und die Eingabe
     * wiederholt.
     *
     * @param prompt Text, der als Eingabeaufforderung angezeigt wird
     * @return das eingegebene Zeichen
     */
    public static char nextChar(String prompt) {
        String s;

        while (true) {
            System.out.println(prompt);
            s = sIn.next();

            // Prüfen, ob genau ein Zeichen eingegeben wurde
            if (s.length() == 1) {
                return s.charAt(0);
            } else {
                System.out.println("Bitte genau ein Zeichen eingeben.");
            }
        }
    }

    /**
     * Liest ein einzelnes Wort (String ohne Leerzeichen) von der Konsole ein.
     *
     * Verwendet Scanner.next(), d. h. die Eingabe wird bis zum nächsten
     * Leerzeichen gelesen.
     *
     * @param prompt Text, der als Eingabeaufforderung angezeigt wird
     * @return das eingegebene Wort
     */
    public static String nextString(String prompt) {
        System.out.println(prompt);
        return sIn.next(); // liest nur ein Wort (bis zum nächsten Leerzeichen)
    }

    /**
     * Liest eine komplette Zeile (inklusive Leerzeichen) von der Konsole ein.
     *
     * Diese Methode verwendet Scanner.nextLine(), um die gesamte Zeile
     * einzulesen. Falls zuvor next() verwendet wurde, kann es nötig sein, ein
     * verbleibendes Zeilenende zu "verwerfen".
     *
     * @param prompt Text, der als Eingabeaufforderung angezeigt wird
     * @return die eingegebene komplette Zeile
     */
    public static String nextLine(String prompt) {
        System.out.println(prompt);

        // Wichtig: ggf. vorheriges Zeilenende konsumieren
        if (sIn.hasNextLine()) {
            String rest = sIn.nextLine();
            if (!rest.isEmpty()) {
                return rest;
            }
        }

        return sIn.nextLine();
    }

    /**
     * Liest einen short-Wert von der Konsole ein.
     */
    public static short nextShort(String prompt) {
        String s;
        while (true) {
            System.out.println(prompt);
            s = sIn.next();
            try {
                return Short.parseShort(s);
            } catch (NumberFormatException ex) {
                System.out.println("Ihre Eingabe " + s + " war fehlerhaft. Bitte eine ganze Zahl zwischen "
                        + Short.MIN_VALUE + " und " + Short.MAX_VALUE + " eingeben.");
            }
        }
    }

    /**
     * Liest einen byte-Wert von der Konsole ein.
     */
    public static byte nextByte(String prompt) {
        String s;
        while (true) {
            System.out.println(prompt);
            s = sIn.next();
            try {
                return Byte.parseByte(s);
            } catch (NumberFormatException ex) {
                System.out.println("Ihre Eingabe " + s + " war fehlerhaft. Bitte eine ganze Zahl zwischen "
                        + Byte.MIN_VALUE + " und " + Byte.MAX_VALUE + " eingeben.");
            }
        }
    }

    /**
     * Liest einen BigInteger-Wert von der Konsole ein.
     *
     * Der Benutzer wird so lange zur Eingabe aufgefordert, bis eine gültige
     * ganze Zahl beliebiger Größe eingegeben wurde.
     *
     * BigInteger eignet sich für sehr große Ganzzahlen, die den Wertebereich
     * von long überschreiten.
     *
     * @param prompt Text, der als Eingabeaufforderung angezeigt wird
     * @return der eingegebene BigInteger-Wert
     */
    public static BigInteger nextBigInteger(String prompt) {
        String s;

        while (true) {
            System.out.println(prompt);
            s = sIn.next();

            try {
                // Konstruktor wirft NumberFormatException bei ungültiger
                // Eingabe
                return new BigInteger(s);
            } catch (NumberFormatException ex) {
                System.out.println("Ihre Eingabe " + s
                        + " war fehlerhaft.\nBitte eine gültige ganze Zahl eingeben (beliebig groß).");
            }
        }
    }

    /**
     * Liest einen BigDecimal-Wert von der Konsole ein.
     *
     * Der Benutzer wird so lange zur Eingabe aufgefordert, bis eine gültige
     * Dezimalzahl eingegeben wurde.
     *
     * BigDecimal wird verwendet für präzise Berechnungen (z. B. Geldbeträge),
     * da im Gegensatz zu float/double keine Rundungsfehler durch
     * Binärdarstellung entstehen.
     *
     * Hinweis: Dezimaltrennzeichen ist der Punkt (.), z. B. 123.45
     *
     * @param prompt Text, der als Eingabeaufforderung angezeigt wird
     * @return der eingegebene BigDecimal-Wert
     */
    public static BigDecimal nextBigDecimal(String prompt) {
        String s;

        while (true) {
            System.out.println(prompt);
            s = sIn.next();

            try {
                // Konstruktor für exakte Dezimalwerte
                return new BigDecimal(s);
            } catch (NumberFormatException ex) {
                System.out.println("Ihre Eingabe " + s
                        + " war fehlerhaft.\nBitte eine gültige Dezimalzahl eingeben (z.B. 123.45).");
            }
        }
    }
}
