package semester2.blatt07;

import java.util.ArrayList;
import java.util.List;
import semester2.Blatt06.ProgAufgabe02.Buch;

public class ProgAufgabe02 {
    public static class Leser {
        private String postAnschrift;

        public String getPostAnschrift() {
            return postAnschrift;
        }

        public void setPostAnschrift(String postAnschrift) {
            this.postAnschrift = postAnschrift;
        }

        public ArrayList<Buch> buecherListe = new ArrayList<>();

        public void ausleihe(Buch b) {
            buecherListe.add(b);
        }

        public boolean rueckgabe(Buch b) {
            if (buecherListe.contains(b)) {
                buecherListe.remove(b);
                return true;
            } else return false;
        }

        public List<Buch> aktAusgabe(){
            return buecherListe;
        }
    }
}
