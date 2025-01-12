package resolucaoiniciante;

import java.io.IOException;

public class Saida2_2748 {

    public static void main(String[] args) throws IOException{

        int largura = 39;
        String[] conteudo = {"Roberto", "", "5786", "", "UNIFEI"};

        for (int i = 0; i < largura; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (String linha : conteudo) {
            System.out.print("|");
            if (linha.isEmpty()) {
                for (int i = 0; i < largura - 2; i++) {
                    System.out.print(" ");
                }
            } else {
                System.out.print("        " + linha);
                for (int i = 0; i < largura - 10 - linha.length(); i++) {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }

        for (int i = 0; i < largura; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
