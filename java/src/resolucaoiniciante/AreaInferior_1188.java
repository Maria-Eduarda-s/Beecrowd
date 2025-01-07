package resolucaoiniciante;
/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida,
calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área inferior da matriz,
conforme ilustrado abaixo (área verde).

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média)
que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante de dupla precisão
(double) que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class AreaInferior_1188 {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        char o = sc.next().charAt(0);
        double[][] m = new double[12][12];
        double soma = 0;
        int count = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j < i && j > m.length - i - 1){
                    soma += m[i][j];
                    count++;
                }
            }
        }

        double media = soma / count;

        if(o == 'S'){
            System.out.printf("%.1f\n", soma);
        }else if(o == 'M'){
            System.out.printf("%.1f\n", media);
        }
    sc.close();
    }
}