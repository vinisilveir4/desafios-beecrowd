package iniciante;

import java.util.Locale;

public class SequenciaIJ4 {
    public static void main(String[] args) {
        double i = 0;
        double j = 1;

        int qntVezesSomado = 0;
        while(i <= 2.0) {

            String[] i2 = String.format("%.1f", i).split("\\.");
            String[] j2 = String.format("%.1f", j).split("\\.");

            if(Integer.parseInt(i2[1]) > 0) {
                System.out.printf("I=%.1f ", i);
            } else {
                System.out.printf("I=%.0f ", i);

            }

            if(Integer.parseInt(j2[1]) > 0) {
                System.out.printf("J=%.1f%n", j);
            } else {
                System.out.printf("J=%.0f%n", j);

            }

            if(qntVezesSomado == 2) {
                i += 0.2;
                j = (j - qntVezesSomado) + 0.2;
                qntVezesSomado = 0;
                continue;
            }

            j += 1;
            qntVezesSomado++;
        }

    }
}
