package iniciante;

import java.util.Scanner;

public class NumeroPerfeito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            int x = scanner.nextInt();

            int soma = 0;
            for(int j = 1; j < x; j++) {
                if(x % j == 0)
                    soma += j;
            }

            if(soma == x)
                System.out.printf("%d eh perfeito%n", soma);
            else
                System.out.printf("%d nao eh perfeito%n", x);
        }


    }
}
