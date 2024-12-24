package strings;

import java.util.Scanner;

public class ConcursoDeContos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String linha = scanner.nextLine();
            String[] ns = linha.split(" ");

            final int MAX_LINHAS_POR_PAGINA = Integer.parseInt(ns[1]);
            final int MAX_CARACTERES = Integer.parseInt(ns[2]);

            String conto = scanner.nextLine();
            String[] palavrasConto = conto.split(" ");

            String linhaConto = palavrasConto[0];
            int countLinha = 1;
            int countPagina = 1;
            for(int j = 1; j < palavrasConto.length; j++) {
                if((linhaConto.length() + palavrasConto[j].length() + 1) > MAX_CARACTERES) {
                    if(countLinha + 1 > MAX_LINHAS_POR_PAGINA) {
                        countLinha = 1;
                        countPagina++;
                    } else {
                        countLinha++;
                    }
                    linhaConto = palavrasConto[j];
                } else {
                    linhaConto += (" " + palavrasConto[j]);
                }
            }

            System.out.println(countPagina);
        }
    }
}
