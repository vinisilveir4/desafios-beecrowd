package strings;

import java.util.Scanner;

public class Combinador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int i = 1;
        while (i <= n) {
            String linha = scanner.nextLine();
            String[] palavras = linha.split(" ");

            String[] palavra1 = palavras[0].split("");
            String[] palavra2 = palavras[1].split("");

            int l1 = palavra1.length;
            int l2 = palavra2.length;

            int lenght = l1 >= l2 ? l2 : l1;
            boolean iguais = l1 == l2;


            String pCombinada = "";
            int j = 0;
            while(j < lenght) {
                pCombinada += palavra1[j] + palavra2[j];
                j++;
            }

            if(iguais)
                System.out.println(pCombinada);
            else {
                String pRestante = String.join("", lenght == l1 ? palavra2 : palavra1).substring(j + 1);
                System.out.println(pCombinada + pRestante);
            }

            i++;
        }
    }
}
