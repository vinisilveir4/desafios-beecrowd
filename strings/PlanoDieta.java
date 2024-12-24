package strings;

import java.util.*;

public class PlanoDieta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++) {
            String dieta = scanner.nextLine();
            String cafe = scanner.nextLine();
            String almoco = scanner.nextLine();

            String alimentosJaConsumidos = cafe + almoco;
            String[] c = alimentosJaConsumidos.split("");
            boolean cheater = false;
            for (String s : c) {

                if (!dieta.contains(s)) {
                    cheater = true;
                    break;
                }

                dieta = dieta.replaceFirst(s, "");
            }

            if(cheater) {
                System.out.println("CHEATER");
                continue;
            }

            List<String> list = Arrays.asList(dieta.split(""));
            Collections.sort(list);

            System.out.println(String.join("", list));
        }
    }
}


