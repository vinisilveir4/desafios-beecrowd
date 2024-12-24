package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class CrescimentoPopulacional {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        if(t < 1 || t > 3000) {
            throw new RuntimeException();
        }

        for(int i = 1; i <= t ; i++) {

            String linha = scanner.nextLine();
            String[] numeros = linha.split(" ");

            int pa = Integer.parseInt(numeros[0]);
            int pb = Integer.parseInt(numeros[1]);
            double g1 = Double.parseDouble(numeros[2]);
            double g2 = Double.parseDouble(numeros[3]);

            int anos = 0;
            int cidadeA = pa;
            int cidadeB = pb;
            while(true) {
                anos++;
                if(anos > 100) {
                    System.out.println("Mais de um seculo.");
                    break;
                }

                cidadeA += (int) (cidadeA * (g1 / 100));
                cidadeB += (int) (cidadeB * (g2 / 100));

                if(cidadeA > cidadeB) break;
            }

            if(anos <= 100)
                System.out.printf("%d anos.%n", anos);
        }
    }
}
