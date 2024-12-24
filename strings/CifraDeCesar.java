package strings;

import java.util.Scanner;

public class CifraDeCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"
                , "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String l = scanner.nextLine();
            int posicoesDeslocadas = Integer.parseInt(scanner.nextLine());

            String[] c = l.split("");
            for (int k = 0; k < c.length; k++) {
                for (int j = 0; j < alfabeto.length; j++) {
                    if (c[k].equalsIgnoreCase(alfabeto[j])) {
                        if (j - posicoesDeslocadas < 0) {
                            c[k] = alfabeto[alfabeto.length - (-1 * (j - posicoesDeslocadas))];
                        } else {
                            c[k] = alfabeto[j - posicoesDeslocadas];
                        }

                        break;
                    }
                }
            }

            System.out.println(String.join("", c));
        }
    }
}
