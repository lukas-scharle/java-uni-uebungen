package semester2.blatt02;

/**
 * Berechnet eine neue Ankunftszeit nach einer Verspaetung. Die Aufgabe zeigt
 * Uhrzeitrechnung, Uebertraege von Minuten auf Stunden und Formatierung mit
 * fuehrenden Nullen.
 */
public class ProgAufgabe04 {
    /**
     * Addiert eine Verspaetung in Minuten auf eine Startuhrzeit.
     *
     * @return formatierte Uhrzeit im Format HH:mm
     */
    public static String neueAnkunftsZeit(int stunde, int minute, int verspaetung) {
        int localstunde = stunde;
        int localminute = minute;
        if (localminute + verspaetung >= 60) {
            localstunde += (localminute + verspaetung) / 60;
            localminute = (localminute + verspaetung) % 60;
        } else {
            localminute += verspaetung;
        }
        if (localstunde >= 24) {
            localstunde = localstunde % 24;
        }
        //return String.valueOf(localstunde) + ":" + String.valueOf(localminute);
        //besser:
        return String.format("%02d:%02d", localstunde, localminute);
    }

    /**
     * Testet die Uhrzeitberechnung mit einem Tageswechsel.
     */
    static void main() {
        System.out.println(neueAnkunftsZeit(23, 46, 123));
    }
}
