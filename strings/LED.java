package strings;

import java.util.Scanner;

public class LED {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= n; i++) {
            String linha = scanner.nextLine();
            String[] nums = linha.split("");

            int qntLed = 0;
            for(String num : nums) {
                int x;
                switch (num) {
                    case "0", "6", "9" -> x = 6;
                    case "1" -> x = 2;
                    case "2", "3", "5" -> x = 5;
                    case "4" -> x = 4;
                    case "7" -> x = 3;
                    case "8" -> x = 7;
                    default -> x = 0;
                }

                qntLed += x;
            }

            System.out.printf("%d leds%n", qntLed);
        }
    }
}
