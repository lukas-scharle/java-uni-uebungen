package semester2.blatt07;

import java.util.Objects;

public class ProgAufgabe01 {

    public static class ComplexNumber implements Comparable<ComplexNumber> {
        private double real;//
        private double imag; // imaginärer Teil// reeller Teil

        // setter und getter-Methoden für Realteil und imaginärteil
        public double getReal() {
            return real;
        }

        public void setReal(double real) {
            this.real = real;
        }

        public double getImag() {
            return imag;
        }

        public void setImag(double imag) {
            this.imag = imag;
        }

        // Konstruktoren
        public ComplexNumber() {
            this(0.0, 0.0);
        }

        public ComplexNumber(double real) {
            this(real, 0.0);
        }

        public ComplexNumber(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }

        //toString Methode
        @Override
        public String toString() {
            return (real + " + " + imag + "i");
        }

        // equals Methode
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof ComplexNumber comp)) return false;
            /*
            if (this.real == comp.real && this.imag == comp.imag) return true;
            else return false;
             */
            // besser und genauer
            if (Double.compare(this.real, comp.real) == 0 && Double.compare(this.imag, comp.imag) == 0) return true;
            else return false;
        }

        //hashcode
        @Override
        public int hashCode() {
            return Objects.hash(real, imag);
        }

        // Addition, Substraktion, Multiplikation
        public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
            return new ComplexNumber(a.real + b.real, a.imag + b.imag);
        }

        public static ComplexNumber sub(ComplexNumber a, ComplexNumber b) {
            return new ComplexNumber(a.real - b.real, a.imag - b.imag);
        }

        public static ComplexNumber mult(ComplexNumber a, ComplexNumber b) {
            return new ComplexNumber((a.real * b.real) + (a.imag * b.imag), (a.imag * b.real) + (a.real * b.imag));
        }

        public static void add(ComplexNumber a, ComplexNumber b, ComplexNumber erg) {
            erg.real = a.real + b.real;
            erg.imag = a.imag + b.imag;
        }

        public static void sub(ComplexNumber a, ComplexNumber b, ComplexNumber erg) {
            erg.real = a.real - b.real;
            erg.imag = a.imag - b.imag;
        }

        public static void mult(ComplexNumber a, ComplexNumber b, ComplexNumber erg) {
            erg.real = (a.real * b.real) + (a.imag * b.imag);
            erg.imag = (a.imag * b.real) + (a.real * b.imag);
        }


        public ComplexNumber add(ComplexNumber a) {
            this.real = this.real + a.real;
            this.imag = this.imag + a.imag;
            return this;
        }

        public ComplexNumber sub(ComplexNumber a) {
            this.real = this.real - a.real;
            this.imag = this.imag - a.imag;
            return this;
        }

        public ComplexNumber mult(ComplexNumber a) {
            this.real = (this.real * a.real) + (this.imag * a.imag);
            this.imag = (this.imag * a.real) + (this.real * a.imag);
            return this;
        }

        // Implementierung der Methode von Comparable
        public int compareTo(ComplexNumber a) {
            double x = (this.real * this.real) + (this.imag * this.imag);
            double y = (a.real * a.real) + (a.imag * a.imag);
            return Double.compare(x, y);
        }
    }
}
