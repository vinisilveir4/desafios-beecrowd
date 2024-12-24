package strings;

import java.util.Scanner;

public class ComparacaoDeSubstrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String p1 = scanner.nextLine();
            String p2 = scanner.nextLine();

            int maior = 0;
            int tamanho = 0;
            int inicio = 0;
            int fim = 1;
            while (true) {
                String subString = p1.substring(inicio, fim);

                if (p2.contains(subString)) {
                    tamanho++;
                    if (fim == p1.length()) break;
                    fim++;
                } else {
                    if (inicio == p1.length() - 1 && fim == p1.length()) break;

                    inicio++;
                    fim = inicio + 1;

                    maior = Math.max(tamanho, maior);
                    tamanho = 0;
                }
            }

            System.out.println(Math.max(tamanho, maior));

        }
    }
}
