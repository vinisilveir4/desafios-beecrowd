package iniciante;

import java.util.Scanner;

public class CorvoContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int i = 0;
        while(i < 3) {
            String input = scanner.nextLine();

            boolean grito = input.startsWith("caw");

            if(grito) {
                System.out.println(soma);
                soma = 0;

                i++;
                continue;
            }

            String[] olhos = input.split("");

            if(olhos[0].equalsIgnoreCase("*"))
                soma += (2 * 2);

            if(olhos[1].equalsIgnoreCase("*"))
                soma += (2);

            if(olhos[2].equalsIgnoreCase("*"))
                soma += 1;
        }
    }
}
