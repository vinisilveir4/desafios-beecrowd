package iniciante;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String descricaoUm = scanner.nextLine();
        String descricaoDois = scanner.nextLine();
        String descricaoTres = scanner.nextLine();

       String animal;
       if(descricaoUm.equalsIgnoreCase("vertebrado")) {
           if(descricaoDois.equalsIgnoreCase("ave")) {
               if(descricaoTres.equalsIgnoreCase("carnivoro")) {
                   animal = "aguia";
               } else {
                   animal = "pomba";
               }
           } else {
               if(descricaoTres.equalsIgnoreCase("onivoro")) {
                   animal = "homem";
               } else {
                   animal = "vaca";
               }
           }
       } else {
           boolean teste = descricaoDois.equalsIgnoreCase("inseto");
           if(descricaoDois.equalsIgnoreCase("inseto")) {
               if(descricaoTres.equalsIgnoreCase("hematofago")) {
                   animal = "pulga";
               } else {
                   animal = "lagarta";
               }
           } else {
               if(descricaoTres.equalsIgnoreCase("hematofago")) {
                   animal = "sanguessuga";
               } else {
                   animal = "minhoca";
               }
           }
       }

        System.out.println(animal);
    }
}
