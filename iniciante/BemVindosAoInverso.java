package iniciante;

import java.util.Scanner;

public class BemVindosAoInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temperaturas = scanner.nextLine().split(" ");

        int t1 = Integer.parseInt(temperaturas[0]);
        int t2 = Integer.parseInt(temperaturas[1]);
        int t3 = Integer.parseInt(temperaturas[2]);


        String output = ":)";

        boolean caiuDo1Pro2 = t1 > t2;
        boolean subiuDo1Pro2 = t1 < t2;
        boolean subiu2pro3 = t2 < t3;
        boolean caiuOuConstante2pro3 = t2 >= t3;
        boolean subiu2pro3MenosQue1Pro2 = t3 - t2 < t2 - t1;
        boolean caiu2Pro3 = t2 > t3;
        boolean caiuOuConstante2e3 = t2 >= t3;
        boolean caiu2Pro3NoMinimoQue1Pro2 = t2 - t3 >= t1 - t2;
        boolean contante1e2 = t1 == t2;

        // verifica se foi triste o inverno
        if (subiuDo1Pro2 && caiuOuConstante2pro3 || subiuDo1Pro2 && subiu2pro3 && subiu2pro3MenosQue1Pro2 ||
                caiuDo1Pro2 && caiu2Pro3 && caiu2Pro3NoMinimoQue1Pro2 || contante1e2 && caiuOuConstante2e3)
            output = ":(";

        System.out.println(output);
    }
}
