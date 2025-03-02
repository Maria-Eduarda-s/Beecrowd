package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 15), correspondente a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o exemplo abaixo.

Entrada
A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a serem construídas. O final da entrada é marcado por um valor 
de ordem igual a zero (0).

Saída
Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. Os valores das matrizes devem ser formatados em um campo de tamanho T 
justificados à direita e separados por espaço, onde T é igual ao número de dígitos do maior número da matriz. Após o último caractere de cada linha da matriz 
não deve haver espaços em branco. Após a impressão de cada matriz deve ser deixada uma linha em branco.
 */

public class MatrizQuadradaIII_1557 {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            
            int[][] matriz = new int[n][n];
            int maiorNumero = 1 << (2 * (n - 1));
            int largura = String.valueOf(maiorNumero).length();
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = (int) Math.pow(2, i + j);
                }
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%" + largura + "d", matriz[i][j]);
                    if (j < n - 1) System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}