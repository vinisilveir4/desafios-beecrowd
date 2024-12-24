package iniciante;

import java.util.Scanner;

public class ConsumoMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();

        double z = x / y;

        System.out.printf("%.3f km/l%n", z);
    }
}
