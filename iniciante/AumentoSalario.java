package iniciante;

import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();

        boolean ate400 = salario <= 400;
        boolean de400a800 = salario <= 800;
        boolean de800a1200 = salario <= 1200;
        boolean de1200a2000 = salario <= 2000;

        double novoSalario;
        int porcentagemDeAjuste;

        if(ate400) {
            novoSalario = salario + (0.15 * salario);
            porcentagemDeAjuste = 15;
        } else if (de400a800) {
            novoSalario = salario + (0.12 * salario);
            porcentagemDeAjuste = 12;
        } else if(de800a1200) {
            novoSalario = salario + (0.10 * salario);
            porcentagemDeAjuste = 10;
        } else if(de1200a2000) {
            novoSalario = salario + (0.07 * salario);
            porcentagemDeAjuste = 7;
        } else {
            novoSalario = salario + (0.04 * salario);
            porcentagemDeAjuste = 4;
        }

        String msgNSalario = String.format("%.2f", novoSalario).replace(",", ".");
        String msgAjuste = String.format("%.2f", (novoSalario - salario)).replace(",", ".");

        System.out.printf("Novo salario: %s%n", msgNSalario);
        System.out.printf("Reajuste ganho: %s%n", msgAjuste);
        System.out.printf("Em percentual: %d %s%n", porcentagemDeAjuste, "%");
    }
}
