public class Aufgabe_17 {
    public static boolean istTeilmenge(int[] a, int[] b) {
        boolean treffer = true;
        for (int i = 0; i < a.length; i++) {
            treffer = false;
            for (int j = 0; j < b.length; j++) {
                if ((a[i] == b[j])) {
                    treffer = true;
                    break;
                }
            }
            if (treffer == false) {
                return false;
            }
        }
        return treffer;
    }
}


