package iniciante;

import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kmPorL = 12;
        int tempoHora = scanner.nextInt();
        int velocidadeMediaPorH = scanner.nextInt();

        double combustivel = (double) (tempoHora * velocidadeMediaPorH) / kmPorL;

        System.out.printf("%.3f%n", combustivel);
    }
}
