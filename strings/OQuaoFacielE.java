package strings;

import java.util.Scanner;

public class OQuaoFacielE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String enunciado = scanner.nextLine();
            String[] palavras = enunciado.split(" ");

            int qntP = 0;
            int tamanhoTotalP = 0;
            for(int i = 0; i < palavras.length; i++) {
                char[] c = palavras[i].toCharArray();
                for(int j = 0; j < c.length; j++) {
                    boolean letra = Character.isLetter(c[j]);

                    if(j == c.length - 1)
                        if(letra || Character.toString(c[j]).equals(".")) {
                            if(letra)
                                tamanhoTotalP += palavras[i].length();
                            else
                                if(!(c.length == 1))
                                    tamanhoTotalP += palavras[i].length() - 1;
                                else
                                    continue;

                            qntP++;
                            continue;
                        }

                    if(!letra) break;
                }
            }

            if(qntP == 0) {
                System.out.println("250");
                continue;
            }

            int media = tamanhoTotalP / qntP;
            switch (media) {
                case 1, 2, 3 -> System.out.println("250");
                case 4, 5 -> System.out.println("500");
                default -> System.out.println("1000");
            }
        }
    }
}
