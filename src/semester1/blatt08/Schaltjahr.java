package semester1.blatt08;

public class Schaltjahr {
    public static boolean schaltjahr(int jahr) {
        if (jahr < -45) {
            return false;
        } else if (jahr % 400 == 0) {
            return true;
        } else if (jahr % 100 == 0) {
            return false;
        } else if (jahr % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
