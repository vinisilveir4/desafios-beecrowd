package iniciante;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(n <= 0 || n >= 13) {
            throw new RuntimeException();
        }

        int total = 1;
        for(int i = 2; i <= n; i++) {
            total *= i;
        }

        System.out.println(total);
    }
}
