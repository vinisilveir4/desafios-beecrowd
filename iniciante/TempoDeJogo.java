package iniciante;

import java.util.Scanner;

public class TempoDeJogo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrInicio = scanner.nextInt();
        int hrFinal = scanner.nextInt();
        int minInicio = scanner.nextInt();
        int minFinal = scanner.nextInt();

        int tempoDeDuracaoH = 0;
        int tempoDeDuracaoM = 0;

        if(hrInicio == hrFinal && minInicio == minFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            return;
        }

        if(hrFinal > hrInicio) {
            tempoDeDuracaoH = hrFinal - hrInicio;
        } else {
            tempoDeDuracaoH = (24 - hrInicio) + hrFinal;
        }

        if(minFinal > minInicio) {
            if(tempoDeDuracaoH == 24) {
                tempoDeDuracaoH = 0;
            }

            tempoDeDuracaoM = minFinal - minInicio;
        } else {
            tempoDeDuracaoM = (60 - minInicio) + minFinal;
            tempoDeDuracaoH -= 1;
        }


        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", tempoDeDuracaoH, tempoDeDuracaoM);
    }
}
















//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int inicioH = sc.nextInt();
//        int inicioM = sc.nextInt();
//
//        int fimH = sc.nextInt();
//        int fimM = sc.nextInt();
//
//        int horas = 0;
//        int minutos = 0;
//
//        if (inicioH > 24 && fimH > 24) {
//            throw new RuntimeException();
//        }
//
//        if (inicioH == fimH && inicioM == fimM) {
//            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
//        } else {
//            while (inicioM != fimM) {
//                if (inicioM != 60) {
//                    minutos++;
//                    inicioM++;
//                } else {
//                    inicioH++;
//                    inicioM = 0;
//                }
//
//            }
//
//            while (inicioH != fimH) {
//                if (inicioH != 24) {
//                    horas++;
//                    inicioH++;
//                } else {
//                    inicioH = 0;
//                }
//
//            }
//
//
//            System.out.println("O JOGO DUROU "+ horas +" HORA(S) E "+ minutos +" MINUTO(S)");

