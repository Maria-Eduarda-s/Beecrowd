package resolucaoiniciante;
/*
 *Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado
 *pela fórmula:
S = 1 + 1/2 + 1/3 + … + 1/100

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.
 */

import java.io.IOException;
import java.util.Locale;

public class SequenciaS_1155 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		
		double soma = 0;

		for (int i = 1; i <= 100; i++) {
		    soma += 1.0 / i;
		}
		System.out.printf("%.2f%n", soma);
	}
}