package iniciante;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double n = 3.14159;
        double A = n * (R * R);

        scanner.close();

        System.out.println("A=" + String.format("%.4f", A));
    }
}
