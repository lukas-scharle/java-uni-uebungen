package semester2.blatt03;

import Util.ReadUtil;

public class ProgAufgabe02 {
    static void main() {
        double a = ReadUtil.nextDouble("Bitte a eingeben: ");
        double b = ReadUtil.nextDouble("Bitte b eingeben: ");
        double c = ReadUtil.nextDouble("Bitte c eingeben: ");
        double d = ReadUtil.nextDouble("Bitte d eingeben: ");
        System.out.printf("%8s | %12s%n", "x", "p(x)");
        System.out.println("---------------------------------");
        for (int i = -50; i <= 50; i += 2) {
            double x = i / 10.0;
            System.out.printf("%8.1f | %12s%n", x, "p(" + (a * (x * x * x) + b * (x * x) + c * x + d) + ")");
        }
    }
}
