package iniciante;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n <= 0 || n >= 46) {
            throw new RuntimeException();
        }

        StringBuilder sequenciaFibo = new StringBuilder("0");

        int segundo = 1;
        int proximo = 1;
        int i = 1;
        while(i <= n) {
            sequenciaFibo.append(" ").append(segundo);

            int temp = segundo;
            segundo = proximo;
            proximo += temp;

            i++;
        }

        System.out.println(sequenciaFibo);
    }
}
