package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
Ana e suas amigas estão fazendo um trabalho de geometria para o colégio, em que precisam formar vários triângulos, numa cartolina, com algumas varetas de comprimentos diferentes. 
Logo elas perceberam que não dá para formar triângulos com três varetas de comprimentos quaisquer: se uma das varetas for muito grande em relação às outras duas, não dá para formar 
o triângulo.

Neste problema, você precisa ajudar Ana e suas amigas a determinar se, dados os comprimentos de quatro varetas, é ou não é possível selecionar três varetas, dentre as quatro, e 
formar um triângulo.

Entrada
A entrada é composta por apenas uma linha contendo quatro números inteiros A, B, C e D (1 ≤ A, B, C, D ≤ 100).

Saída
Seu programa deve produzir apenas uma linha contendo apenas um caractere, que deve ser ‘S’ caso seja possível formar o triângulo, ou ‘N’ caso não seja possível formar o triângulo.
 */

public class Triangulo_1929 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((a + b > c && a + c > b && b + c > a) ||
            (a + b > d && a + d > b && b + d > a) ||
            (a + c > d && a + d > c && c + d > a) ||
            (b + c > d && b + d > c && c + d > b)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }

}
