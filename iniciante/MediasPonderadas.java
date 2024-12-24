package iniciante;

import java.util.Scanner;


public class MediasPonderadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String[] notas = linha.split(" ");

            double[] notas2 = new double[3];
            for(int j = 0; j < 3; j++) {
                notas2[j] = Double.parseDouble(notas[j]);
            }

            double media = (notas2[0] * 2 + notas2[1] * 3 + notas2[2] * 5) / (2 + 3 + 5);
            String msg = String.format("%.1f", media).replace(",", ".");

            System.out.println(msg);
        }
    }
}
