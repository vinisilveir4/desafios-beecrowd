package strings;

import java.util.Scanner;

public class AtalhosBloggo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String texto = scanner.nextLine();
            String[] c = texto.split("");

            boolean iInicial = true;
            boolean nInicial = true;
            for(int i = 0; i < c.length; i++) {
                if(c[i].equals("_")) {
                    if(iInicial)
                        c[i] = "<i>";
                    else
                        c[i] = "</i>";

                    iInicial = !iInicial;
                }

                if(c[i].equals("*")) {
                    if(nInicial)
                        c[i] = "<b>";
                    else
                        c[i] = "</b>";

                    nInicial = !nInicial;
                }
            }

            System.out.println(String.join("", c));
        }
    }
}
