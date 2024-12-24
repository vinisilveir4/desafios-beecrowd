package iniciante;

import java.util.Scanner;

public class CordenadasDeUmPonto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if(x == 0 && y == 0) {
            System.out.println("Origem");
        } else if(x == 0) {
            System.out.println("Eixo Y");
        } else if(y == 0) {
            System.out.println("Eixo X");
        } else {

            if(x > 0) {
                if(y > 0) {
                    System.out.println("Q1");
                } else {
                    System.out.println("Q4");
                }
            } else {
                if(y > 0) {
                    System.out.println("Q2");
                } else {
                    System.out.println("Q3");
                }
            }

        }
    }
}
