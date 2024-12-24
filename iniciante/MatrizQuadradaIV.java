package iniciante;

import java.util.Scanner;

public class MatrizQuadradaIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        boolean ehSoma = t.equalsIgnoreCase("S");

//        int q = 0;
//        double total = 0.0;

        while (scanner.hasNext()) {
            int c = Integer.valueOf(scanner.nextLine());
            for (int i = 0; i < c; i++) {
                String l = "";
                for (int j = 0; j < c; j++) {
                    boolean externo = (i < c / 3 || i >= c - c / 3);

                    if (j == i && externo)
                        l += "2";
                    else if (c - 1 - i == j && externo)
                        l += "3";
                    else if (j != i && (c - 1 - i != j) && externo || (j < c / 3 || j >= c - c / 3))
                        l += "0";
                    else if ((i >= c / 3 && i < c - c / 3)) {
                        if (i == c / 2 && j == c / 2)
                            l += "4";
                        else
                            l += "1";
                    }
                }

                System.out.println(l);
            }

            System.out.println();
        }
    }

}
