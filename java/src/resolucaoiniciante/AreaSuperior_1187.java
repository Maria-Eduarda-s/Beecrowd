package resolucaoiniciante;
/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule
e mostre a soma ou a média considerando somente aqueles elementos que estão na área superior da matriz, conforme
ilustrado abaixo (área verde).

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média)
que deverá ser realizada com os elementos da matriz. Seguem 144 valores com ponto flutuante de dupla precisão que
compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AreaSuperior_1187 {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double calc = 0, media = 0, quant = 0, k = 12;
        char o = sc.next().charAt(0);
        double[][] matriz = new double[12][12];

        for (int j = 0; j < 12; j++) {
            for (int i = 0; i < 12; i++) {
                matriz[j][i] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            k--;
            for (int j = 1; j < k; j++) {
                if (j > i) {
                    calc += matriz[i][j];
                    quant++;
                }
            }
        }
        if (o == 'S') {
            System.out.printf("%.1f%n", calc);
        } else {
            media = calc / quant;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}