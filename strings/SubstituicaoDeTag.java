package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstituicaoDeTag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String tag = scanner.nextLine();
            String novaTag = scanner.nextLine();
            String doc = scanner.nextLine();

            String[] c = doc.split("");
            List<int[]> posicoesMarcadasParaTroca = new ArrayList<>();
            int indexInicio = -1;
            for (int i = 0; i < c.length; i++) {
                if (indexInicio >= 0) {
                    if (c[i].equals(">")) {
                        posicoesMarcadasParaTroca.add(new int[]{indexInicio, i});
                        indexInicio = -1;
                        continue;
                    }

                }

                if (c[i].equals("<")) {
                    indexInicio = i;
                }
            }

            StringBuilder novoDoc = new StringBuilder(doc);
            for (int[] posicoes : posicoesMarcadasParaTroca) {
                String tagSubstituida = doc.substring(posicoes[0], posicoes[1] + 1).replaceAll("(?i)" + tag, novaTag);

                int diferenca = novoDoc.length() - doc.length();
                int posicaoInicial = posicoes[0] + diferenca;
                int posicaoFinal = posicoes[1] + 1 + diferenca;

                novoDoc.replace(posicaoInicial, posicaoFinal, tagSubstituida);
            }

            System.out.println(novoDoc);
        }
    }
}
