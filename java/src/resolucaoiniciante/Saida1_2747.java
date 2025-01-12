package resolucaoiniciante;

import java.io.IOException;

public class Saida1_2747 {

    public static void main(String[] args) throws IOException{
        
        int largura = 39;

        for(int i = 0; largura > i; i++){
            System.out.print("-");
        }
        System.out.println();
        
        for(int i = 0; 5 > i; i++){
            System.out.print("|");
            for(int j = 0; j < largura - 2; j++){
                System.out.print(" ");
            }
            System.out.println("|");
        }

        for(int i = 0; largura > i; i++){
            System.out.print("-");
        }

        System.out.println();
    }
}