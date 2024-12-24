package iniciante;

import java.util.Scanner;

public class Grenais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grenais = 0;
        int inter = 0;
        int gremio = 0;
        int empate = 0;

        int i = 1;
        while(i != 2) {
            String linha = scanner.nextLine();
            String[] ns = linha.split(" ");

            int x = Integer.parseInt(ns[0]);
            int y = Integer.parseInt(ns[1]);

            if(x > y)
                inter++;
            else if(y > x)
                gremio++;
            else
                empate++;

            int escolha;
            do {
                System.out.println("Novo grenal (1-sim 2-nao)");
                String temp = scanner.nextLine();

                escolha = temp.equals("1") ? 1 : temp.equals("2") ? 2 : 0;
            } while(!(escolha == 1 || escolha == 2));

            i = escolha;
            grenais++;
        }

        System.out.printf("%d grenais%n", grenais);
        System.out.printf("Inter:%d%n", inter);
        System.out.printf("Gremio:%d%n", gremio);
        System.out.printf("Empates:%d%n", empate);

        if(inter == gremio) {
            System.out.println("Nao houve vencedor");
            return;
        }

        if(gremio > inter)
            System.out.println("Gremio venceu mais");
        else {
            System.out.println("Inter venceu mais");
        }
    }
}
