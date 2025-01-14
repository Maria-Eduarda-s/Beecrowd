package resolucaoiniciante;

/*
Dada uma letra do alfabeto, informe qual a sua posição.

Entrada
Um único caracter L, uma letra maiúscula ('A'-'Z') do alfabeto.

Saída
Um único inteiro, que representa a posição da letra no alfabeto.
 */

import java.io.IOException;
import java.util.Scanner;

public class BalaoDeHonra_2987 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        char l = sc.next().charAt(0);
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i = 0; i< alfabeto.length; i++){
            if(Character.toLowerCase(l) == alfabeto[i]){
                System.out.println(i + 1);
                break;
            }
        }

        sc.close();
    }
}
