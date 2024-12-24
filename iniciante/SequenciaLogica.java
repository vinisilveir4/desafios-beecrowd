package iniciante;

import java.util.Scanner;

public class SequenciaLogica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 1 || n >= 1000) {
            throw new RuntimeException();
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2; j++) {
                int primeiro = i;
                int segundo;
                int terceiro;

                if (j == 1) {
                    segundo = i * primeiro;
                    terceiro = i * segundo;
                    continue;
                }

                int temp = i * primeiro;
                segundo = temp + 1;
                terceiro = (i * temp) + 1;

                System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
            }
        }
    }
}
