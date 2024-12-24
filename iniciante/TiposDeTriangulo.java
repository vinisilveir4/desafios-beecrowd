package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class TiposDeTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = new double[3];
        nums[0] = scanner.nextDouble();
        nums[1] = scanner.nextDouble();
        nums[2] = scanner.nextDouble();

        Arrays.sort(nums);

        for(int i = 0; i < 3; i++) {
            nums[i] = nums[nums.length - i - 1];
        }

        double a = nums[0];
        double b = nums[1];
        double c = nums[2];

        double somaPotenciasDeBeC = Math.pow(b, 2) + Math.pow(c, 2);
        double potenciaDeA = Math.pow(a, 2);

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (potenciaDeA == somaPotenciasDeBeC) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (potenciaDeA > somaPotenciasDeBeC) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || c == a) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
