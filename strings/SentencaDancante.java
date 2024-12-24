package strings;

import java.util.Scanner;

public class SentencaDancante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String sentenca = scanner.nextLine();
            String[] caracteres = sentenca.split("");

            boolean proxMaiuscula = true;
            for(int i = 0; i < caracteres.length; i++) {
                if(caracteres[i].trim().isEmpty()) continue;

                String c = caracteres[i];
                caracteres[i] = proxMaiuscula ? c.toUpperCase() : c.toLowerCase();

                proxMaiuscula = !proxMaiuscula;
            }

            System.out.println(String.join("", caracteres));
        }
    }
}
