package iniciante;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            boolean ehPrimo = false;
            if(x <= 1) continue;

            for(int j = 2; j <= x; j++) {
                if(j == x) {
                    ehPrimo = true;
                    break;
                }

                if(x % j == 0) break;
            }


            System.out.printf("%d %s%n", x, ehPrimo ? "eh primo" : "nao eh primo");
        }
    }
}
