package strings;

import java.util.*;

public class PoucaFrequencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < t; i++) {
            int nDeEstudantes = Integer.parseInt(scanner.nextLine());
            String[] estudantes = scanner.nextLine().split(" ");
            String[] frequencia = scanner.nextLine().split(" ");

            if (nDeEstudantes == 0) {
                System.out.println();
                continue;
            }

            LinkedList<String> estudantesAbaixoDaMedia = new LinkedList<>();
            Map<String, String> info = new LinkedHashMap<>();
            for(int j = 0; j < nDeEstudantes; j++) {
                info.put(estudantes[j], frequencia[j]);
            }

            for(String estudante : info.keySet()) {
                String[] frequenciaEstudante = info.get(estudante).split("");

                int totalAulas = frequenciaEstudante.length;
                int presenca = 0;
                for(int k = 0; k < frequenciaEstudante.length; k++) {
                    if(frequenciaEstudante[k].equalsIgnoreCase("P"))
                        presenca++;
                    else if(frequenciaEstudante[k].equalsIgnoreCase("M"))
                        totalAulas--;
                }

                double mediaPeresenca = ((double) presenca / totalAulas) * 100;

                if(mediaPeresenca < 75.00) {
                    estudantesAbaixoDaMedia.addLast(estudante);
                }
            }

            if(estudantesAbaixoDaMedia.isEmpty()) {
                System.out.println();
                continue;
            }

            int n = 1;
            for(String est : estudantesAbaixoDaMedia){

                if (n == estudantesAbaixoDaMedia.size()) {
                    System.out.printf("%s%n", est);
                    break;
                }

                System.out.print(est + " ");
                n++;
            }
        }
    }
}
