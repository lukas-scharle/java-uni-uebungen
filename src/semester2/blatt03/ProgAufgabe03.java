package semester2.blatt03;

public class ProgAufgabe03 {

    public static int[][] magischesQuadrat(int kantenlänge) {
        int[][] quadrat = new int[kantenlänge][kantenlänge];
        int posX = kantenlänge / 2 + 1;
        int posY = kantenlänge / 2;
        quadrat[posX][posY] = 1;

        for (int i = 2; i < kantenlänge * kantenlänge; i++) {
            int neuesX = (posX + 1) % kantenlänge;
            int neuesY = (posY + 1) % kantenlänge;

            if (quadrat[neuesX][neuesY] == 0) {
                posX = neuesX;
                posY = neuesY;
            } else {
                neuesX = (posX + 1) % kantenlänge;
                neuesY = (posY - 1 + kantenlänge) % kantenlänge;

                while (quadrat[neuesX][neuesY] != 0) {
                    posX = neuesX;
                    posY = neuesY;

                    neuesX = (posX + 1) % kantenlänge;
                    neuesY = (posY - 1 + kantenlänge) % kantenlänge;
                }
                posX = neuesX;
                posY = neuesY;
            }
            quadrat[posX][posY] = i;
        }
        return quadrat;
    }

    public static void ausgeben(int[][] quadrat) {
        for (int i = 0; i < quadrat.length; i++) {
            for (int j = 0; j < quadrat[i].length; j++) {
                System.out.printf("%3d", quadrat[i][j]);
            }
            System.out.println();
        }
    }


    static void main() {
        ausgeben(magischesQuadrat(7));
    }
}
