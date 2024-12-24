package iniciante;

import java.util.Scanner;

public class Media3 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();


        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1);

        String msg = String.format("%.1f", media).replace(",", ".");

        System.out.printf("Media: %s%n", msg);

        if(media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if(media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            double notaExame = scanner.nextDouble();

            String msg1 = String.format("%.1f", notaExame).replace(",", ".");

            System.out.printf("Nota do exame: %s%n", msg1);

            media = (media + notaExame) / 2;

            if(media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }

        String msg3 = String.format("%.1f", media).replace(",", ".");

        System.out.printf("Media final: %s%n", msg3);
    }
}
