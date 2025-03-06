package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
Um número número 3 é de má sorte si contém um 1 seguido por um 3 entre seus dígitos. Por exemplo, o número 341329 é de má 
sorte, enquanto o número 26771 não é.

Dado um inteiro N, seu programa terá que determinar se N é azarado ou não.

Entrada
A entrada consiste em um número positivo N (0 <= N <= 10¹⁷).

Saída
Imprima a mensagem "N es de Mala Suerte" se N é de má sorte, caso contrário imprima "N NO es de Mala Suerte".
 */

public class NumerosMaSortePequenos_3299 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
       
        String N = sc.nextLine();
        
        if (N.contains("13")) {
            System.out.println(N + " es de Mala Suerte");
        } else {
            System.out.println(N + " NO es de Mala Suerte");
        }
        
        sc.close();
    }

}
