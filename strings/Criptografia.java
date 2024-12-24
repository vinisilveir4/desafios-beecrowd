package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Criptografia {
//    private static String[] ascii = {"@", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"
//            , "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "[", "\\", "]"};
//
//    private static String[] ascii2 = {"`", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"
//            , "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "{", "|", "}"};

//    static String[] caracteresMaiuscula = {"[", "\\", "]"};
//    static String[] caracteresMinuscula = {"{", "|", "}"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String texto = scanner.nextLine();
            char[] caracteres = texto.toCharArray();

            for (int k = 0; k < caracteres.length; k++) {
                if (Character.isLetter(caracteres[k]))
                    caracteres[k] += 3;
            }

            char[] temp = caracteres.clone();
            int metade = caracteres.length / 2;

            for (int j = 0; j < caracteres.length; j++)
                caracteres[j] = temp[caracteres.length - 1 - j];

            for (int k = metade; k < caracteres.length; k++)
                caracteres[k] -= 1;

            System.out.println(new String(caracteres));
        }
    }
}
//
//        for(int i = 1; i <= n; i++) {
//            String texto = scanner.nextLine();
//            String[] caracteres = texto.split("");
//
//            Map<String, String> z = new HashMap<>();
//            for(int k = 0; k < caracteres.length; k++) {
//                String novoCaracter = null;
//                for(int j = 0; j < ascii.length; j++) {
//                    if(!(caracteres[k].equalsIgnoreCase(ascii[j]))) continue;
//
//                    boolean isMaiusculo = caracteres[k].equals(ascii[j]);
//                    if(isMaiusculo) {
//                        novoCaracter = ascii[j + 3];
//                        z.put(novoCaracter, ascii[j + 2]);
//                    }
//                    else {
//                        novoCaracter = ascii2[j + 3];
//                        z.put(novoCaracter, ascii2[j + 2]);
//                    }
//                }
//                if(novoCaracter == null) continue;
//
//                caracteres[k] = novoCaracter;
//            }
//
//            String[] novoTexto = new String[caracteres.length];
//            int metade = caracteres.length / 2;
//
//            for(int k = 0; k < novoTexto.length; k++) {
//                String caracter = caracteres[caracteres.length - 1 - k];
//
//                novoTexto[k] = k >= metade && z.containsKey(caracter) ? z.get(caracter) : caracter;
//            }
//
//            System.out.println(String.join("", novoTexto));



//        for (int i = 1; i <= n; i++) {
//
//            String texto = scanner.nextLine();
//            String[] caracteres = texto.split("");
//
//            Map<String, String> z = new HashMap<>();
//            for (int k = 0; k < caracteres.length; k++) {
//
//                if (caracteres[k].trim().isEmpty()) continue;
//
//                for (int j = 0; j < ascii.length; j++) {
//                    if (ascii[j].equalsIgnoreCase(caracteres[k])) {
//                        int restante = (ascii.length - 1) - j;
//                        boolean isMinusculo = caracteres[k] != caracteres[k].toUpperCase();
//                        String novoCaracter;
//                        if (restante >= 3) {
//                            int posicao = j + 3;
//                            novoCaracter = ascii[posicao];
//
//                            if (isMinusculo)
//                                novoCaracter = novoCaracter.toLowerCase();
//
//                            caracteres[k] = novoCaracter;
//
//                            // salva o caracter a esquerda
//                            z.put(novoCaracter, caracterAntecessor(isMinusculo, posicao, true));
//                            break;
//                        } else {
//                            int posicao = 2 - restante;
//                            novoCaracter = isMinusculo ? caracteresMinuscula[posicao] : caracteresMaiuscula[posicao];
//                            caracteres[k] = novoCaracter;
//
//                            z.put(novoCaracter, caracterAntecessor(isMinusculo, posicao, false));
//                            break;
//                        }
//                    }
//                }
//            }
//
//            String[] newCaracteres = new String[caracteres.length];
//            int metade = newCaracteres.length / 2;
//
//            for (int k = 0; k < caracteres.length; k++) {
//                String caracter = caracteres[caracteres.length - 1 - k];
//
//                if(k >= metade)
//                    if (z.containsKey(caracter))
//                        caracter = z.get(caracter);
//
//                newCaracteres[k] = caracter;
//            }
//
//            String textoFinal = String.join("", newCaracteres);
//
//            System.out.println(textoFinal);
//        }


//    private static String caracterAntecessor(boolean isMinusculo, int posicao, boolean isLetra) {
//        boolean msm = posicao - 1 < 0;
//
//        int nPosicao = posicao - 1;
//        if (isLetra) {
//            if (isMinusculo)
//                return msm ? "`" : ascii[nPosicao].toLowerCase();
//            else
//                return msm ? "@" : ascii[nPosicao];
//        } else {
//            if (isMinusculo)
//                return msm ? ascii[ascii.length - 1].toLowerCase() : caracteresMinuscula[nPosicao];
//            else
//                return msm ? ascii[ascii.length - 1] : caracteresMaiuscula[nPosicao];
//        }



// erro: esperado: wdxthupqe; resultado: wdxthvpqe
