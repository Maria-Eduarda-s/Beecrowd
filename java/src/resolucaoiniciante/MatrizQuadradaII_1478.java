package resolucaoiniciante;

/*
Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o exemplo abaixo.

Entrada
A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a serem construídas. O final da entrada é marcado por um valor de 
ordem igual a zero (0).

Saída
Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. (os valores das matrizes devem ser formatados em um campo de tamanho 3 justificados 
à direita e separados por espaço. Após o último caractere de cada linha da matriz não deve haver espaços em branco. Após a impressão de cada matriz deve ser deixada uma 
linha em branco.
 */

import java.util.Scanner;

public class MatrizQuadradaII_1478 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        
        while (true) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    output.append(String.format("%3d", Math.abs(i - j) + 1));
                    if (j < N - 1) {
                        output.append(" ");
                    }
                }
                output.append("\n");
            }
            output.append("\n");
        }
        
        System.out.print(output);
        sc.close();
    }

}
