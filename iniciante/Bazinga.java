package iniciante;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bazinga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // combinação para vitoria
        Map<String, List<String>> combinacaoWin = new HashMap<>();
        combinacaoWin.put("tesoura", List.of("papel", "lagarto"));
        combinacaoWin.put("papel", List.of("pedra", "spock"));
        combinacaoWin.put("pedra", List.of("lagarto", "tesoura"));
        combinacaoWin.put("lagarto", List.of("spock", "papel"));
        combinacaoWin.put("spock", List.of("tesoura", "pedra"));

        int n = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= n; i++) {
            String[] escolhas = scanner.nextLine().split(" ");
            String sheldon = escolhas[0];
            String raj = escolhas[1];

            // verifica empate
            boolean empate = sheldon.equalsIgnoreCase(raj);
            if(empate) {
                System.out.printf("Caso #%d: De novo!%n", i);
                continue;
            }

            // verifica vitoria do sheldon
            boolean sheldonWin = combinacaoWin.get(sheldon.toLowerCase()).stream().anyMatch(item -> raj.equalsIgnoreCase(item));

            if(sheldonWin)
                System.out.printf("Caso #%d: Bazinga!%n", i);
            else
                System.out.printf("Caso #%d: Raj trapaceou!%n", i);
        }
    }
}
