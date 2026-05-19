package semester2.Blatt06;

public class ProgAufgabe01 {
    public static class Person {
        private String anschrift;
        private String plz;
        private String stadt;
        private String land;

        public String getAnschrift() {
            return anschrift;
        }

        public void setAnschrift(String anschrift) {
            this.anschrift = anschrift;
        }

        public String getLand() {
            return land;
        }

        public void setLand(String land) {
            this.land = land;
        }

        public String getPlz() {
            return plz;
        }

        public void setPlz(String plz) {
            this.plz = plz;
        }

        public String getStadt() {
            return stadt;
        }

        public void setStadt(String stadt) {
            this.stadt = stadt;
        }

        @Override
        public String toString() {
            return anschrift + "\n" + plz + " " + stadt + "\n" + land;
        }
    }

    static void main() {
        Person p = new Person();
            p.setAnschrift("Hohe Straße 16");
            p.setLand("Deutschland");
            p.setPlz("67304");
            p.setStadt("Eisenberg");
        System.out.println(p.toString());
    }


}
