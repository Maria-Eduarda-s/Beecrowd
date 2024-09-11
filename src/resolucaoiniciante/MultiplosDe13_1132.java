package resolucaoiniciante;

/*
 * Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos 
 * números que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente 
em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores 
lidos na entrada, inclusive ambos se for o caso.
 */

import java.io.IOException;
import java.util.Scanner;

public class MultiplosDe13_1132 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int total = 0;
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int maior = Math.max(X, Y);
		int menor = Math.min(X, Y);

		while (menor <= maior) {

			if (menor % 13 != 0) {
				total += menor;
			}
			menor++;
		}
		System.out.println(total);
		sc.close();
	}
}