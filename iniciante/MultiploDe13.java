package iniciante;

import java.util.Scanner;

public class MultiploDe13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if(n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int soma = 0;
        for(int i = n1; i <= n2; i++) {
            if(i % 13 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
