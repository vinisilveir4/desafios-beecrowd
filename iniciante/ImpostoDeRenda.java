package iniciante;

import java.util.Scanner;

public class ImpostoDeRenda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        if(salario <= 2000) {
            System.out.println("Isento");
            return;
        }

        double imposto = 0.0;
        if(salario > 2000 && salario <= 3000) {
            imposto = 0.08 * (salario - 2000);
        }

        if(salario > 3000 && salario <= 4500) {
            double impostodeOitoPorcento = 0.08 * 1000;
            imposto = 0.18 * (salario - 3000) + impostodeOitoPorcento;
        }

        if(salario > 4500) {
            double impostodeOitoPorcento = 0.08 * 1000;
            double impostode18Porcento = 0.18 * 1500;
            imposto = 0.28 * ((salario - 4500)) + impostodeOitoPorcento + impostode18Porcento;
        }

        String msg = String.format("%.2f", imposto).replace(",", ".");
        System.out.printf("R$ %s%n", msg);
    }
}
