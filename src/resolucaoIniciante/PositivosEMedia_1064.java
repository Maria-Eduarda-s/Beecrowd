package resolucaoIniciante;

/*
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
 * Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um 
 * dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos 
um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar 
a média dos valores positivos digitados.
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PositivosEMedia_1064 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int j = 0;
		Double[] valor = new Double[6];

		for (int i = 0; i < 6; i++) {
			Double N = sc.nextDouble();
			if (N > 0) {
				j++;
				valor[i] = N;
			} else {
			}
		}
		double media = 0.0;
		if (j > 0) {
			for (int i = 0; i < 6; i++) {
				if (valor[i] != null) {
					media += valor[i];
				}
			}
		}
		media /= j;

		System.out.println(j + " valores positivos");
		System.out.printf("%.1f%n", media);

		sc.close();
	}
}