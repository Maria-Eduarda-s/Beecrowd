package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. Conferir se um texto vai caber em um tuíte é sua tarefa.

Entrada
A entrada é uma linha de texto T (1 ≤ |T| ≤ 500).

Saída
A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a linha de texto T tem até 140 caracteres. Se T tem mais de 
140 caracteres, a saída deve ser "MUTE".
 */

public class Tuitando_2165 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();

        if(t.length() <= 140){
            System.out.println("TWEET");
        }else{
            System.out.println("MUTE");
        }

        sc.close();
    }

}
