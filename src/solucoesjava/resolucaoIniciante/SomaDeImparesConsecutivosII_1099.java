package solucoesjava.resolucaoIniciante;

/*
 *Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de 
 *teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares 
 *existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.
 */

import java.io.IOException;
import java.util.Scanner;

public class SomaDeImparesConsecutivosII_1099 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int soma = 0;
		int j = 0;

		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();

			int menor = Math.min(X, Y);
			int maior = Math.max(X, Y);

			for (j = menor + 1; j < maior; j++) {

				if (j % 2 != 0) {
					soma += j;
				}
			}
			System.out.println(soma);
			soma = 0;
		}
		sc.close();
	}
}