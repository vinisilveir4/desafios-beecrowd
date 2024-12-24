package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class VariasNotasComValidacao {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while(i != 2) {

            double total = 0.0;
            final int QNT_NOTAS = 2;
            int j = 0;
            while(j < QNT_NOTAS) {
                double nota = scanner.nextDouble();

                if(nota < 1 || nota > 10) {
                    System.out.println("nota invalida");
                    continue;
                }

                j++;
                total += nota;
            }

            System.out.printf("media = %.2f%n", (total / QNT_NOTAS));

            int x;
            while(true) {
                System.out.println("novo calculo (1-sim 2-nao)");
                x = scanner.nextInt();

                if(x == 1 || x == 2) break;
            }

            i = x;
        }
    }
}
