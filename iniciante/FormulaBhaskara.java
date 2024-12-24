package iniciante;

import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double r1 = Math.pow(b, 2) - (4 * a * c);

        if(r1 < 0 || a == 0)
            System.out.println("Impossivel calcular");
        else {
            double x1 = (-b + Math.sqrt(r1)) / (2 * a);
            double x2 = (-b - Math.sqrt(r1)) / (2 * a);


            String x1Formatado = String.format("%.5f", x1).replace(",", ".");
            String x2Formatado = String.format("%.5f", x2).replace(",", ".");

            System.out.printf("R1 = %s%n", x1Formatado);
            System.out.printf("R2 = %s%n", x2Formatado);
        }
    }
}
