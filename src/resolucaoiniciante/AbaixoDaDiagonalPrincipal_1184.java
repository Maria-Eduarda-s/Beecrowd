package resolucaoiniciante;

/*Leia um caractere maiúsculo, que indica uma operação que deve ser 
 * realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma 
 * ou a média considerando somente aqueles elementos que estão abaixo da 
 * diagonal principal da matriz, conforme ilustrado abaixo (área verde).

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 
'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os 
elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem 
a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto 
decimal.
 * 
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaDiagonalPrincipal_1184 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double calc = 0, media = 0, quant = 0;
		char o = sc.next().charAt(0);
		double[][] matriz = new double[12][12];

		for (int j = 0; j < 12; j++) {
			for (int i = 0; i < 12; i++) {
				matriz[j][i] = sc.nextDouble();
			}
		}

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < i; j++) {
				calc += matriz[i][j];
				quant++;
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