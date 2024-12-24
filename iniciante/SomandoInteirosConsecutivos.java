package iniciante;

import java.util.Scanner;

public class SomandoInteirosConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String linha = scanner.nextLine();
        String[] numeros = linha.split(" ");

        int a = Integer.parseInt(numeros[0]);
        int n = Integer.parseInt(numeros[1]);

        int nAtual = 1;
        while(true) {

            if(n <= 0) {
                ++nAtual;
                n = Integer.parseInt(numeros[nAtual]);
                continue;
            }

            int total = 0;
            for(int i = 0; i <= (n - 1); i++) {
                total += a + i;
            }

            System.out.println(total);
            break;
        }
    }
}
