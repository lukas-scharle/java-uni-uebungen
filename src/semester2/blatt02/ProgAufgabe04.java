package semester2.blatt02;

public class ProgAufgabe04 {
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

    // TEST
    static void main() {
        System.out.println(neueAnkunftsZeit(23, 46, 123));
    }
}
