package iniciante;

import java.util.Scanner;

public class LinhaNaMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[12][12];

        int linha = Integer.valueOf(scanner.nextLine());
        String operacao = scanner.nextLine();

        double total = 0.0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                double numero = scanner.nextDouble();

                if(linha == j)
                    total += numero;

                matriz[i][j] = numero;
            }
        }

        System.out.printf("%.1f%n", operacao.equalsIgnoreCase("S") ? total : total / 12);
    }
}
