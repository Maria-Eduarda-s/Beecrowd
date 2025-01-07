package solucoesjava.resolucaoIniciante;

/*
 * Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são 
 * pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
 */

import java.io.IOException;
import java.util.Scanner;

public class ParesEntreCincoNumeros_1065 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int j = 0;

		for (int i = 0; i < 5; i++) {
			int N = sc.nextInt();
			if (N % 2 == 0) {
				j++;
			} else {
			}
		}
		System.out.println(j + " valores pares");
		sc.close();
	}
}