package iniciante;

import java.util.Locale;

public class Sequencia5Dois {
    public static void main(String[] args) {

        double S = 1.0;
        int divisor = 2;
        for(int i = 3; i < 40; i += 2) {
            S += (((double) i) / divisor);

            divisor *= 2;
        }

        System.out.printf("%.2f%n", S);
    }
}
