package strings;

import java.util.Scanner;

public class DeDentroParaFora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= n; i++) {
            String linha = scanner.nextLine();
            String[] caracteres = linha.split("");

            int meio = caracteres.length / 2;
            String[] caracteresReordenados = new String[caracteres.length];

            for(int j = meio - 1; j >= 0; j--) {
                caracteresReordenados[meio - 1 - j] = caracteres[j];
            }

            for(int k = meio; k < caracteres.length; k++) {
                caracteresReordenados[k] = caracteres[caracteres.length - 1 - (k - meio)];
            }

            System.out.println(String.join("", caracteresReordenados).trim());
        }
    }
}
