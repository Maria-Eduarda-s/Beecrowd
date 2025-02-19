package resolucaoiniciante;

import java.io.IOException;
import java.util.Scanner;

/*
Escreva um algoritmo que leia um inteiro N (0 ≤ N ≤ 100), correspondente a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o exemplo abaixo.

Entrada
A entrada consiste de vários inteiros, um valor por linha, correspondentes as ordens das matrizes a serem construídas. O final da entrada é marcado por um valor de ordem igual a zero (0).

Saída
Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o exemplo. Os valores das matrizes devem ser formatados em um campo de tamanho 3 justificados à direita e separados 
por espaço. Após o último caractere de cada linha da matriz não deve haver espaços em branco. Após a impressão de cada matriz deve ser deixada uma linha em branco.
 */

public class MatrizQuadradaI_1435 {

    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }

            int[][] mat = new int[N][N];

            for (int layer = 0; layer < (N + 1) / 2; layer++) {
                for (int i = layer; i < N - layer; i++) {
                    for (int j = layer; j < N - layer; j++) {
                        mat[i][j] = layer + 1;
                    }
                }
            }

            printMatrix(mat);
        }

        sc.close();
    }

    private static void printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                sb.append(String.format("%3d", row[j]));
                if (j < row.length - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        sb.append("\n");
        System.out.print(sb.toString());
    }
}