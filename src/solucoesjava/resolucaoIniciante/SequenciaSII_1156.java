package solucoesjava.resolucaoIniciante;

/*
 *Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado
 *pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.
 */

import java.io.IOException;
import java.util.Locale;

public class SequenciaSII_1156 {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);

		double numerador = 1;
		double denominador = 1;
		double calculo = 0;

		for (int i = 0; i < 20; i++) {
			calculo += numerador / denominador;
			numerador += 2;
			denominador *= 2;
		}
		System.out.printf("%.2f%n", calculo);
	}
}