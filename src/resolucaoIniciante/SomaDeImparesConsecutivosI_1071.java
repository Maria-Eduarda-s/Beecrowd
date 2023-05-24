package resolucaoIniciante;

/*
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre 
 * eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão 
entre os valores fornecidos na entrada que deverá caber em um inteiro.
 */

import java.io.IOException;
import java.util.Scanner;

public class SomaDeImparesConsecutivosI_1071 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();

		int menor = Math.min(X, Y);
		int maior = Math.max(X, Y);

		int soma = 0;
		for (int i = menor + 1; i < maior; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);

		sc.close();
	}
}
