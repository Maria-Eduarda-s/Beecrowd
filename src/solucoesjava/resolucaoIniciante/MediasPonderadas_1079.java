package solucoesjava.resolucaoIniciante;

/*
 *Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso 
 *de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média 
 *ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, 
 *o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém 
um caso de teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 */

import java.io.IOException;
import java.util.Scanner;

public class MediasPonderadas_1079 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Double a, b, c;

		for (int i = 0; i < N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			System.out.printf("%.1f%n", ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5));
		}
		sc.close();
	}
}
