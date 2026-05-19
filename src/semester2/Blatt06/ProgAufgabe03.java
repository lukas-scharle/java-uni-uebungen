package semester2.Blatt06;

public class ProgAufgabe03 {
    public static class Vektor3D {
        private double x;
        private double y;
        private double z;

        // initialisiert einen 3D-Vektor mit Defaultwerten
        public Vektor3D() {
            x = 0.0;
            y = 0.0;
            z = 0.0;
        }

        // initialisiert mit vordefinierten Koordinaten
        public Vektor3D(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        } // end of constructor

        //#### setter- and getter-Methoden f¨ur die Koordinaten
        public void setX(double x) {
            this.x = x;
        }

        public double getX() {
            return x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getY() {
            return y;
        }

        public void setZ(double z) {
            this.z = z;
        }

        public double getZ() {
            return z;
        }
//### Methoden, um den Vektor zu ver¨andern

        /**
         * verschiebt den Vektor
         *
         * @ param v Verschiebungsvektor
         */
        public void translate(Vektor3D v) {
            this.x += v.x;
            this.y += v.y;
            this.z += v.z;
        } // end of translate

        // Skaliert den Vektor
        public void scale(double faktor) {
            x *= faktor;
            y *= faktor;
            z *= faktor;
        } // end of scale

        //#### toString
        @Override
        public String toString() {
            return "(" + x + "|" + y + "|" + z + ")";
        } // end of toString

        //### STATIC-Methoden
        public static Vektor3D add(Vektor3D a, Vektor3D b) {
            Vektor3D vek = new Vektor3D();
            vek.x = a.x + b.x;
            vek.y = a.y + b.y;
            vek.z = a.z + b.z;
            return vek;
        }

        public static Vektor3D sub(Vektor3D a, Vektor3D b) {
            Vektor3D vek = new Vektor3D();
            vek.x = a.x - b.x;
            vek.y = a.y - b.y;
            vek.z = a.z - b.z;
            return vek;
        }

        // berechnet das Skalarprodukt zweier Vektoren
        public static double calcScalarProduct(Vektor3D a, Vektor3D b) {
            double erg = (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
            return erg;
        } // end of calcScalarProduct
    } // end of Vektor3D
}
