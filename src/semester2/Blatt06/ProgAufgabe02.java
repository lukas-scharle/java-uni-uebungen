package semester2.Blatt06;

public class ProgAufgabe02 {
    public static class Buch {
        private String autor;
        private String titel;
        private String isbn;

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getTitel() {
            return titel;
        }

        public void setTitel(String titel) {
            this.titel = titel;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return titel + ",\n" + autor + ",\n" + isbn;
        }
    }

    static void main() {
        Buch b = new Buch();
        System.out.println(b.toString());
    }
}
