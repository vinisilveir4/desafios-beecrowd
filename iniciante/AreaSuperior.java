package iniciante;

import java.util.Scanner;

public class AreaSuperior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine();
        double result = 0;
        int qnt = 0;
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                double n = scanner.nextDouble();

                if(i >= 11 / 2)
                    continue;

                if(j > i && j < 11 - i) {
                    result += n;
                    qnt++;
                }

            }
        }

        System.out.printf("%.1f%n", operacao.equalsIgnoreCase("S") ? result : result / qnt);
    }
}
