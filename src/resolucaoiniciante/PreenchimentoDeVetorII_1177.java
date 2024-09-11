package resolucaoiniciante;

/*Faça um programa que leia um valor T e preencha um vetor N[1000] com a 
 * sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo 
 * abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do 
vetor e x é o valor armazenado naquela posição.
 * 
 */

import java.io.IOException;
import java.util.Scanner;

public class PreenchimentoDeVetorII_1177 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] N = new int[1000];
		int j = 0;

		while (j < N.length) {
			for (int i = 0; i < T; i++) {
				N[j] = i;
				System.out.println("N[" + j + "] = " + i);
				j++;
				if (j == N.length) {
					break;
				}
			}
		}
	}
}