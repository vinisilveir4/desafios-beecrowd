package iniciante;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoEmSegundos = scanner.nextInt();

        int minutosTotais = tempoEmSegundos / 60;
        int horas = minutosTotais / 60;
        int segundos = tempoEmSegundos % 60;
        int minutos = (tempoEmSegundos % 3600) / 60;

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }
}
